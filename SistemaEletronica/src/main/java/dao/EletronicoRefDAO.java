package dao;


import dominio.EletronicoReformado;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class EletronicoRefDAO {
    public void inserir(EletronicoReformado eletronicoRef) throws HibernateException {        
        Session sessao = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.save(eletronicoRef);

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
    
    
    public List<EletronicoReformado> listar() throws HibernateException {
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(EletronicoReformado.class);
            consulta.from(EletronicoReformado.class);
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
