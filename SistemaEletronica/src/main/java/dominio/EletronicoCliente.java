package dominio;

public class EletronicoCliente {
    private int idEletronico;
    private String descricao;
    private String problemas;
    private TipoEletronico tipo;

    
    
    
    public EletronicoCliente(int idEletronico, String descricao, String problemas, TipoEletronico tipo) {
        this.idEletronico = idEletronico;
        this.descricao = descricao;
        this.problemas = problemas;
        this.tipo = tipo;
    }

    
    
    
    public int getIdEletronico() {
        return idEletronico;
    }

    public void setIdEletronico(int idEletronico) {
        this.idEletronico = idEletronico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    public TipoEletronico getTipo() {
        return tipo;
    }

    public void setTipo(TipoEletronico tipo) {
        this.tipo = tipo;
    }
    
}
