package dao;

import dominio.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CidadeDAO {
    
    public List<Cidade> listar() throws ClassNotFoundException, SQLException {
        Statement stmt = ConnectionPSQL.getInstance().createStatement();
        
        List<Cidade> listaCidade = new ArrayList();
        String sql = "SELECT * FROM CIDADE";
        
        ResultSet res = stmt.executeQuery(sql);
        
        while ( res.next() ) {
            int id = res.getInt("id_cidade");
            String nome = res.getString("nome_cidade");
            
            Cidade cidade = new Cidade(id,nome);
            listaCidade.add(cidade);
        }
        
        return listaCidade;
    }
    
    
    public int inserir(String nome) throws SQLException{
        String sql = "INSERT INTO CIDADE (nome_cidade) VALUES (?)";
        
        PreparedStatement pstmt = ConnectionPSQL.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS );
        
        int ind = 1;
        pstmt.setString(ind++, nome );
    
        pstmt.execute();
        
        int id = -1;
        ResultSet rs = pstmt.getGeneratedKeys();
        if ( rs.next() ) {
            id = rs.getInt(1);
        }
        
        return id; 
    }
}
