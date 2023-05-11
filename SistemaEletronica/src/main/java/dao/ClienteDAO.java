package dao;

import dominio.Cidade;
import dominio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ClienteDAO {
    public void inserir(Cliente cliente) throws HibernateException {        
        Session sessao = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.save(cliente);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
    
    
    
    public void excluir(Cliente cliente) throws HibernateException {        
       Session sessao = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.delete(cliente);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
     
    
    
    public List<Cliente> listar() throws HibernateException {
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(Cliente.class);
            consulta.from(Cliente.class);
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }
    
    
    private List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException {
       
        return null;
    }
    
    
    public List<Cliente> pesquisarNome(String pesq) throws HibernateException {
        return null;
    }
    
    public List<Cliente> pesquisarID(String pesq) throws HibernateException {
        return null;
    }
}
