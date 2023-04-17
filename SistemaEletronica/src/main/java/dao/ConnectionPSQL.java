package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPSQL {
    
    private static Connection conexao;
    
    public static Connection getInstance(){
        if(conexao == null){
            try {
                String url = "jdbc:postgresql://localhost:5432/eletronicaluis";
                String user = "postgres";
                String password = "postgres";
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(url, user, password); 
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Erro ao conectar no banco de dados" + e);
            }             
        }
        return conexao;
    } 
}
