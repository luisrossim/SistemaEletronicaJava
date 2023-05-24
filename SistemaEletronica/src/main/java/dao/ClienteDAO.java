package dao;

import dominio.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ClienteDAO extends GenericDAO {
    
    //LISTA TODOS (FALTA IMPLEMENTAR O TIPO FILTRADO)
    private List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException {
        return listar(Cliente.class);
    }
            
    public List<Cliente> pesquisarClienteNome(String pesq) throws HibernateException {
        return pesquisar(pesq,0);
    }
    
    public List<Cliente> pesquisarClienteCidade(String pesq) throws HibernateException {
        return pesquisar(pesq,1);
    }
    
    public List<Cliente> pesquisarClienteCPF(String pesq) throws HibernateException {
        return pesquisar(pesq,2);
    }
}
