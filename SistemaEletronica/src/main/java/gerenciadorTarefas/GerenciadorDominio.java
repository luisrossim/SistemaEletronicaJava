package gerenciadorTarefas;

import dao.CidadeDAO;
import dao.ClienteDAO;
import dao.ConnectionHibernate;
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
        ConnectionHibernate.getSessionFactory();
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
    
    
    
    
    
    public int inserirCidade(String nome) throws SQLException {
        Cidade cidade = new Cidade(nome);
        cidadeDao.inserir(cidade);
        return cidade.getIdCidade();
    }
    
    public int inserirTipoEletronico(String nome, Marca marca) throws SQLException {
        TipoEletronico tipo = new TipoEletronico(nome, marca);
        tipoEletronicoDao.inserir(tipo);
        return tipo.getIdTipoEletronico();
    }
    
    public int inserirMarca(String nome) throws SQLException {
        Marca marca = new Marca(nome);
        marcaDao.inserir(marca);
        return marca.getIdMarca();
    }
    
    public int inserirCliente(String nome, String telefone, String cpf, Cidade cidade, char sexo, String email) throws ClassNotFoundException, SQLException {
        Cliente cliente = new Cliente(nome, telefone, cpf, sexo, email, cidade);
        clienteDao.inserir(cliente);
        return cliente.getIdCliente();
    }
    
    public List<Cliente> pesquisarCliente (String pesq, int tipo) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = null;
        lista = clienteDao.listar();
        /*
        switch (tipo) {
            case 0: lista = clienteDao.pesquisarNome(pesq); break;

            case 1: lista = clienteDao.pesquisarID(pesq); break;
        }
        */
        return lista;
    }
    
    
    
    
    public void excluirCliente(Cliente cliente){
        clienteDao.excluir(cliente);
    }
    
    
    
}
