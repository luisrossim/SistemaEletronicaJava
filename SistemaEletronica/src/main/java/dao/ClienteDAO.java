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
        
        String sql = "INSERT INTO Cliente (nome_cliente, telefone, cpf, sexo, email, id_cidade)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstmt = ConnectionPSQL.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS );
        
        int ind = 1;
        pstmt.setString(ind++, cliente.getNome() );
        pstmt.setString(ind++, cliente.getCpf() );     
        pstmt.setString(ind++, String.valueOf( cliente.getSexo() ) );
        pstmt.setString(ind++, cliente.getTelefone() );
        pstmt.setString(ind++, cliente.getEmail() );
        pstmt.setInt(ind++, cliente.getCidade().getId_cidade() );
        
        pstmt.execute();
        
        int id = -1;
        ResultSet rs = pstmt.getGeneratedKeys();
        if ( rs.next() ) {
            id = rs.getInt(1);
        }
        
        return id;        
    }
    
    
    
    public void excluir(Cliente cliente) throws SQLException {        
        Statement stmt = ConnectionPSQL.getInstance().createStatement();
        String sql = "DELETE FROM Cliente WHERE ID_CLIENTE = " + cliente.getIdCliente();
      
        stmt.execute(sql);
    }
     
    
    
    public void alterar(Cliente cliente) throws SQLException {
         
        String sql = "UPDATE Cliente SET (nome_cliente=?, telefone=?, cpf=?, sexo=?, email=?, id_cidade=?)"
                + "WHRERE ID_CLIENTE = " + cliente.getIdCliente();
        
        PreparedStatement pstmt = ConnectionPSQL.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS );
        
        int ind = 1;
        pstmt.setString(ind++, cliente.getNome() );
        pstmt.setString(ind++, cliente.getCpf() );     
        pstmt.setString(ind++, String.valueOf( cliente.getSexo() ) );
        pstmt.setString(ind++, cliente.getTelefone() );
        pstmt.setString(ind++, cliente.getEmail() );
        pstmt.setInt(ind++, cliente.getCidade().getId_cidade() );
        
        pstmt.execute();
    }
    
    
    private List<Cliente> pesquisar(String pesq, int tipo) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = new ArrayList();
        
        Statement stmt = ConnectionPSQL.getInstance().createStatement();
        String sql = "SELECT * FROM Cliente as cli, Cidade as cid WHERE cli.id_cidade = cid.id_cidade ";
        
        switch (tipo) {
            case 0:
                sql = sql + "AND cli.nome_cliente = '" + pesq + "' "; break;

            case 1:
                break;
        }
        
        ResultSet rs = stmt.executeQuery(sql);
        
        // Registros em Objetos
        while ( rs.next() ) {
            
            Cidade cid = new Cidade(rs.getInt("cid.id_cidade") , rs.getString("cid.nome_cidade"));
                       
            Cliente cli = new Cliente( rs.getString("cli.nome_cliente"), rs.getString("telefone"), rs.getString("cpf"),
                rs.getString("sexo").charAt(0), rs.getString("email"), cid);
            
            cli.setIdCliente( rs.getInt("id_cliente") );
            lista.add(cli);
        }
        
        return lista;
    }
    
    
    public List<Cliente> pesquisarNome(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq,0);
    }
    
    public List<Cliente> pesquisarID(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq,1);
    }
}
