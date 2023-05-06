package dominio;

public class TipoEletronico {
    
    private int idTipoEletronico;
    private String nomeTipoEletronico;
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
