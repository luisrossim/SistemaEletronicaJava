package dominio;

public class Cidade {
    private int idCidade;
    private String nomeCidade;
    
    
    
    
    public Cidade(int idCidade, String nomeCidade) {
        this.idCidade = idCidade;
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
