package dao;

import dominio.Marca;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MarcaDAO {
     public List<Marca> listar() throws ClassNotFoundException, SQLException {
        Statement stmt = ConnectionPSQL.getInstance().createStatement();
        
        List<Marca> listaMarca = new ArrayList();
        String sql = "SELECT * FROM MARCA";
        
        ResultSet res = stmt.executeQuery(sql);
        
        while ( res.next() ) {
            int id = res.getInt("id_marca");
            String nome = res.getString("nome_marca");
            
            Marca tipoeletronico = new Marca(id,nome);
            listaMarca.add(tipoeletronico);
        }
        
        return listaMarca;
    }
}
