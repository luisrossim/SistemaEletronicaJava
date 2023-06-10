package dao;

import dominio.TipoEletronico;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class TipoEletronicoDAO {
    public List<String> listarTipoNome() throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery query = builder.createQuery( TipoEletronico.class );
            
            // FROM
            Root tabela = query.from(TipoEletronico.class);
            
            query.select(tabela.get("nomeTipoEletronico"));
            lista = sessao.createQuery(query).getResultList();            

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
    }
}
