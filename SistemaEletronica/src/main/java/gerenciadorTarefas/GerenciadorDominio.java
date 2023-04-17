package gerenciadorTarefas;

import dao.CidadeDAO;
import dao.ConnectionPSQL;
import dominio.Cidade;
import java.sql.SQLException;
import java.util.List;

public class GerenciadorDominio {
    CidadeDAO cidadeDao = null;
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConnectionPSQL.getInstance();
        cidadeDao = new CidadeDAO();
    }
    
    
    public List<Cidade> listarCidades() throws ClassNotFoundException, SQLException {
        return cidadeDao.listar();
    }
}
