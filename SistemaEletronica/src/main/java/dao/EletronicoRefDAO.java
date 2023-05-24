package dao;


import dominio.EletronicoReformado;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class EletronicoRefDAO extends GenericDAO {
    
    //LISTA TODOS (FALTA IMPLEMENTAR O TIPO FILTRADO)
    private List<EletronicoReformado> pesquisar(String pesq, int tipo) throws HibernateException {
        return listar(EletronicoReformado.class);
    }
            
    public List<EletronicoReformado> pesquisarEletronicoReformado(String pesq) throws HibernateException {
        return pesquisar(pesq,0);
    }
    
    public List<EletronicoReformado> pesquisarEletronicoTipo(String pesq) throws HibernateException {
        return pesquisar(pesq,1);
    }
    
    public List<EletronicoReformado> pesquisarEletronicoMarca(String pesq) throws HibernateException {
        return pesquisar(pesq,2);
    }
    
    public List<EletronicoReformado> pesquisarEletronicoValor(String pesq) throws HibernateException {
        return pesquisar(pesq,3);
    }
}