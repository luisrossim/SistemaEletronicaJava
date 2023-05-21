package dao;

import dominio.Servico;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ServicoDAO {
    public void inserir(Servico servico) throws HibernateException {        
        Session sessao = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.save(servico);

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
    
    public List<Servico> listar() throws HibernateException {
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(Servico.class);
            consulta.from(Servico.class);
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
    
}
