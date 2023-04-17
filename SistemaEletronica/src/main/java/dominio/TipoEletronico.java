package dominio;

public class TipoEletronico {
    
    private int id_tipoeletronico;
    private String nome_eletronico;

    public TipoEletronico(int id_tipoeletronico, String nome_eletronico) {
        this.id_tipoeletronico = id_tipoeletronico;
        this.nome_eletronico = nome_eletronico;
    }
    
    

    public int getId_tipoeletronico() {
        return id_tipoeletronico;
    }

    public void setId_tipoeletronico(int id_tipoeletronico) {
        this.id_tipoeletronico = id_tipoeletronico;
    }

    public String getNome_eletronico() {
        return nome_eletronico;
    }

    public void setNome_eletronico(String nome_eletronico) {
        this.nome_eletronico = nome_eletronico;
    }

    
    
    
    
    @Override
    public String toString() {
        return this.nome_eletronico;
    }
}
