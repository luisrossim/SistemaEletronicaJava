package dominio;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class TipoEletronico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoEletronico;
    
    @Column(length = 50)
    private String nomeTipoEletronico;
    
    @Transient
    private Marca marca;
    
    

    public TipoEletronico(int idTipoEletronico, String nomeTipoEletronico, Marca marca) {
        this.idTipoEletronico = idTipoEletronico;
        this.nomeTipoEletronico = nomeTipoEletronico;
        this.marca = marca;
    }
    
    
    

    public int getIdTipoEletronico() {
        return idTipoEletronico;
    }

    public void setIdTipoEletronico(int idTipoEletronico) {
        this.idTipoEletronico = idTipoEletronico;
    }

    public String getNomeTipoEletronico() {
        return nomeTipoEletronico;
    }

    public void setNomeTipoEletronico(String nomeTipoEletronico) {
        this.nomeTipoEletronico = nomeTipoEletronico;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
  
    
    
    
    
    @Override
    public String toString() {
        return this.nomeTipoEletronico;
    }
}
