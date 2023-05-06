package dao;

import dominio.Cidade;
import dominio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public int inserir(Cliente cliente) throws ClassNotFoundException, SQLException {        
        
        return 0;        
    }
    
    
    
    public void excluir(Cliente cliente) throws SQLException {        
       
    }
     
    
    
    public void alterar(Cliente cliente) throws SQLException {
       
    }
    
    
    private List<Cliente> pesquisar(String pesq, int tipo) throws ClassNotFoundException, SQLException {
       
        return null;
    }
    
    
    public List<Cliente> pesquisarNome(String pesq) throws ClassNotFoundException, SQLException {
        return null;
    }
    
    public List<Cliente> pesquisarID(String pesq) throws ClassNotFoundException, SQLException {
        return null;
    }
}
