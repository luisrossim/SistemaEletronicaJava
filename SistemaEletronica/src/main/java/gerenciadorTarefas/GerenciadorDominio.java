package gerenciadorTarefas;

import dao.CidadeDAO;
import dao.ConnectionPSQL;
import dao.MarcaDAO;
import dao.TipoEletronicoDAO;
import dominio.Cidade;
import dominio.Marca;
import dominio.TipoEletronico;
import java.sql.SQLException;
import java.util.List;

public class GerenciadorDominio {
    
    CidadeDAO cidadeDao = null;
    TipoEletronicoDAO tipoEletronicoDao = null;
    MarcaDAO marcaDao = null;
    
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConnectionPSQL.getInstance();
        cidadeDao = new CidadeDAO();
        tipoEletronicoDao = new TipoEletronicoDAO();
        marcaDao = new MarcaDAO();
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
}
