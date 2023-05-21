package gerenciadorTarefas;

import dao.CidadeDAO;
import dao.ClienteDAO;
import dao.ConnectionHibernate;
import dao.EletronicoCliDAO;
import dao.EletronicoRefDAO;
import dao.MarcaDAO;
import dao.ServicoDAO;
import dao.TipoEletronicoDAO;
import dominio.Cidade;
import dominio.Cliente;
import dominio.EletronicoCliente;
import dominio.EletronicoReformado;
import dominio.Marca;
import dominio.Servico;
import dominio.TipoEletronico;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class GerenciadorDominio {
    
    CidadeDAO cidadeDao = null;
    TipoEletronicoDAO tipoEletronicoDao = null;
    MarcaDAO marcaDao = null;
    ClienteDAO clienteDao = null;
    EletronicoRefDAO eletronicoRefDao = null;
    EletronicoCliDAO eletronicoCliDao = null;
    ServicoDAO servicoDao = null;
    
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConnectionHibernate.getSessionFactory();
        cidadeDao = new CidadeDAO();
        tipoEletronicoDao = new TipoEletronicoDAO();
        marcaDao = new MarcaDAO();
        clienteDao = new ClienteDAO();
        eletronicoRefDao = new EletronicoRefDAO();
        eletronicoCliDao = new EletronicoCliDAO();
        servicoDao = new ServicoDAO();
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
    
    
    
    
    
    public int inserirEletronicoReformado(String descricao, String reparos, int valor, TipoEletronico tipo){
        EletronicoReformado eletronicoRef = new EletronicoReformado(descricao, reparos, valor, tipo);
        eletronicoRefDao.inserir(eletronicoRef);
        return eletronicoRef.getIdEletronicoRef();
    }
    
    
    public int inserirCidade(String nome) throws SQLException {
        Cidade cidade = new Cidade(nome);
        cidadeDao.inserir(cidade);
        return cidade.getIdCidade();
    }
    
    public int inserirServico(Cliente cliente, String descricaoElet, String descricaoSer, TipoEletronico tipo, int valor, Date dataInicio, Date dataFim, String local, String problemas) throws SQLException {
        EletronicoCliente eletronicoCli = new EletronicoCliente(descricaoElet, problemas, tipo);
        Servico servico = new Servico(local, descricaoSer, "", false, valor, dataInicio, dataFim, cliente, eletronicoCli);
        servicoDao.inserir(servico);
        return servico.getIdServico();
    }
    
    public int inserirTipoEletronico(String nome, Marca marca) {
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
    
    public List<EletronicoReformado> pesquisarEletronicos (String pesq, int tipo) throws ClassNotFoundException, SQLException {
        List<EletronicoReformado> lista = null;
        lista = eletronicoRefDao.listar();
        return lista;
    }
    
    public List<Servico> pesquisarServicosEmAndamento () throws ClassNotFoundException, SQLException {
        List<Servico> lista = null;
        lista = servicoDao.listar();
        return lista;
    }
     
     
    
    
    public void excluirCliente(Cliente cliente){
        clienteDao.excluir(cliente);
    }
    
    
    
}
