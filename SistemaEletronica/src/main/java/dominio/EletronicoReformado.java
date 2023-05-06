package dominio;

public class EletronicoReformado {
    private int idEletronicoRef;
    private String descricao;
    private String reparos;
    private int valor;
    private TipoEletronico tipo;

    
    
    public EletronicoReformado(int idEletronicoRef, String descricao, String reparos, int valor, TipoEletronico tipo) {
        this.idEletronicoRef = idEletronicoRef;
        this.descricao = descricao;
        this.reparos = reparos;
        this.valor = valor;
        this.tipo = tipo;
    }

    
    
    
    public int getIdEletronicoRef() {
        return idEletronicoRef;
    }

    public void setIdEletronicoRef(int idEletronicoRef) {
        this.idEletronicoRef = idEletronicoRef;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReparos() {
        return reparos;
    }

    public void setReparos(String reparos) {
        this.reparos = reparos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoEletronico getTipo() {
        return tipo;
    }

    public void setTipo(TipoEletronico tipo) {
        this.tipo = tipo;
    }

   
}
