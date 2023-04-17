package dao;

import dominio.TipoEletronico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoEletronicoDAO {
      public List<TipoEletronico> listar() throws ClassNotFoundException, SQLException {
        Statement stmt = ConnectionPSQL.getInstance().createStatement();
        
        List<TipoEletronico> listaTipoEletronico = new ArrayList();
        String sql = "SELECT * FROM TIPOELETRONICO";
        
        ResultSet res = stmt.executeQuery(sql);
        
        while ( res.next() ) {
            int id = res.getInt("id_tipoeletronico");
            String nome = res.getString("nome_eletronico");
            
            TipoEletronico tipoeletronico = new TipoEletronico(id,nome);
            listaTipoEletronico.add(tipoeletronico);
        }
        
        return listaTipoEletronico;
    }
}
