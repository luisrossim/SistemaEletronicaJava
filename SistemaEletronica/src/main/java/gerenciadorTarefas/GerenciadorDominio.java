package gerenciadorTarefas;

import dao.CidadeDAO;
import dao.ClienteDAO;
import dao.ConnectionPSQL;
import dao.MarcaDAO;
import dao.TipoEletronicoDAO;
import dominio.Cidade;
import dominio.Cliente;
import dominio.Marca;
import dominio.TipoEletronico;
import java.sql.SQLException;
import java.util.List;

public class GerenciadorDominio {
    
    CidadeDAO cidadeDao = null;
    TipoEletronicoDAO tipoEletronicoDao = null;
    MarcaDAO marcaDao = null;
    ClienteDAO clienteDao = null;
    
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConnectionPSQL.getInstance();
        cidadeDao = new CidadeDAO();
        tipoEletronicoDao = new TipoEletronicoDAO();
        marcaDao = new MarcaDAO();
        clienteDao = new ClienteDAO();
    }
    
    
    
    public List<Cidade> listarCidades() throws ClassNotFoundException, SQLException {
        return cidadeDao.listar();
    }
    
    public List<TipoEletronico> listarTipoEletronicos() throws ClassNotFoundException, SQLException {
        return tipoEletronicoDao.listar();
    }
    
    public List<Marca> listarMarcas() throws ClassNotFoundException, SQLException {
        return marcaDao.listar();
    }
    
    
    
    
    
    public int inserirCidade(String nome) throws SQLException{
        int id = cidadeDao.inserir(nome);
        Cidade cidade = new Cidade(id, nome);
        return id;
    }
    
    public int inserirCliente(String nome, String telefone, String cpf, Cidade cidade, char sexo, String email) throws ClassNotFoundException, SQLException {
        Cliente cliente = new Cliente(nome, telefone, cpf, sexo, email, cidade);
        int id = clienteDao.inserir(cliente);
        cliente.setIdCliente(id);
        return id;
    }
    
    public List<Cliente> pesquisarCliente (String pesq, int tipo) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = null;
        switch (tipo) {
            case 0: lista = clienteDao.pesquisarNome(pesq); break;

            case 1: lista = clienteDao.pesquisarID(pesq); break;
        }
        return lista;
    }
}
