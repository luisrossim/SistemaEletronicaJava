package gerenciadorTarefas;

import dao.ClienteDAO;
import dao.ConnectionHibernate;
import dao.EletronicoRefDAO;
import dao.GenericDAO;
import dao.TipoEletronicoDAO;
import dominio.Cidade;
import dominio.Cliente;
import dominio.EletronicoCliente;
import dominio.EletronicoReformado;
import dominio.Marca;
import dominio.Servico;
import dominio.TipoEletronico;
import dominio.VendaReformado;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

public class GerenciadorDominio {
    
    GenericDAO genDao = null;
    ClienteDAO clienteDao = null;
    EletronicoRefDAO eletronicoRefDao = null;
    TipoEletronicoDAO tipoEletronicoDao = null;
    
    
    public GerenciadorDominio() throws ClassNotFoundException {
        ConnectionHibernate.getSessionFactory();
        genDao = new GenericDAO();
        clienteDao = new ClienteDAO();
        eletronicoRefDao = new EletronicoRefDAO();
        tipoEletronicoDao = new TipoEletronicoDAO();
    }
    
    
    
    //==================================================================================
    //INSERIR
    public int inserirEletronicoReformado(String descricao, String reparos, int valor, TipoEletronico tipo) throws HibernateException {
        EletronicoReformado eletronicoRef = new EletronicoReformado(descricao, reparos, valor, tipo);
        eletronicoRefDao.inserir(eletronicoRef);
        return eletronicoRef.getIdEletronicoRef();
    }
    
    public int inserirCidade(String nome) throws HibernateException {
        Cidade cidade = new Cidade(nome);
        genDao.inserir(cidade);
        return cidade.getIdCidade();
    }
    
    public int inserirServico(Cliente cliente, String descricaoElet, String descricaoSer, TipoEletronico tipo, int valor, Date dataInicio, Date dataFim, String local, String problemas) throws HibernateException {
        EletronicoCliente eletronicoCli = new EletronicoCliente(descricaoElet, problemas, tipo);
        Servico servico = new Servico(local, descricaoSer, "", false, valor, dataInicio, dataFim, cliente, eletronicoCli);
        genDao.inserir(servico);
        return servico.getIdServico();
    }
    
    public int inserirTipoEletronico(String nome, Marca marca) throws HibernateException {
        TipoEletronico tipo = new TipoEletronico(nome, marca);
        genDao.inserir(tipo);
        return tipo.getIdTipoEletronico();
    }
    
    public int inserirMarca(String nome) throws HibernateException {
        Marca marca = new Marca(nome);
        genDao.inserir(marca);
        return marca.getIdMarca();
    }
    
    public int inserirCliente(String nome, String telefone, String cpf, Cidade cidade, char sexo, String email) throws ClassNotFoundException, HibernateException {
        Cliente cliente = new Cliente(nome, telefone, cpf, sexo, email, cidade);
        clienteDao.inserir(cliente);
        return cliente.getIdCliente();
    }
    
    public int inserirVenda(Date data, String desc, int valor, Cliente cli, EletronicoReformado elet){
        VendaReformado venda = new VendaReformado(data, desc, valor, cli, elet);
        genDao.inserir(venda);
        System.out.println(elet.isVendido());
        return venda.getIdVenda();
    }
    
    
    
    //==================================================================================
    //LISTAR
    public List listar(Class classe) throws HibernateException {        
        return genDao.listar(classe);        
    }
    
    public List listarNome(Class classe) throws HibernateException {        
        return tipoEletronicoDao.listarTipoNome();        
    }
    
    public List<Cliente> pesquisarCliente (String pesq, int tipo) throws ClassNotFoundException, HibernateException {
        List<Cliente> lista = null;
        switch (tipo) {
            case 0: lista = clienteDao.pesquisarClienteNome(pesq); break;
            case 1: lista = clienteDao.pesquisarClienteCidade(pesq); break;
            case 2: lista = clienteDao.pesquisarClienteCPF(pesq); break;
        }
        return lista;
    }
    
    public List<EletronicoReformado> pesquisarEletronico (String pesq, int tipo) throws ClassNotFoundException, HibernateException {
        List<EletronicoReformado> lista = null;
        switch (tipo) {
            case 0: lista = eletronicoRefDao.pesquisarEletronicoReformado(pesq); break;
            case 1: lista = eletronicoRefDao.pesquisarEletronicoTipo(pesq); break;
            case 2: lista = eletronicoRefDao.pesquisarEletronicoMarca(pesq); break;
            case 3: lista = eletronicoRefDao.pesquisarEletronicoValor(pesq); break;
        }
        return lista;
    }
    
    public List<Servico> pesquisarServicos () throws ClassNotFoundException, HibernateException {
        List<Servico> lista = null;
        lista = genDao.listar(Servico.class);
        return lista;
    }
    
    public List<VendaReformado> pesquisarVendas () throws ClassNotFoundException, HibernateException {
        List<VendaReformado> lista = null;
        lista = genDao.listar(VendaReformado.class);
        return lista;
    }
     
    
    
    //==================================================================================
    //EXCLUIR
    public void excluirCliente(Cliente cliente){
        clienteDao.excluir(cliente);
    }
    
    
    
    //==================================================================================
    //ALTERAR
    public void alterarCliente(){
        //PARAMETRO (CLIENTE + DADOS)
        //SETAR NOVOS DADOS NO CLIENTE
        //CHAMAR FUNCAO ALTERAR (UPDATE)
    }
    
    
}
