package dao;

import dominio.Cidade;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CidadeDAO {
    
    public List<Cidade> listar() throws ClassNotFoundException, SQLException {
        Statement stmt = ConnectionPSQL.getInstance().createStatement();
        
        List<Cidade> listaCidade = new ArrayList();
        String sql = "SELECT * FROM Cidade";
        
        ResultSet res = stmt.executeQuery(sql);
        
        while ( res.next() ) {
            int id = res.getInt("id_cidade");
            String nome = res.getString("nome_cidade");
            
            Cidade cidade = new Cidade(id,nome);
            listaCidade.add(cidade);
        }
        
        return listaCidade;
    }
}
