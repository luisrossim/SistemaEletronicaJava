package dominio;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCidade;
    
    @Column(length = 50)
    private String nomeCidade;
    
    
    
    public Cidade(){}
    
    public Cidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    
    
    

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    
    

    
    @Override
    public String toString() {
        return this.nomeCidade;
    }
}
