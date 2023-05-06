package dominio;

public class VendaReformado {
    private int idVenda;
    private String dataVenda;
    private String descricao;
    private int valorFinal;
    private Cliente cliente;
    private EletronicoReformado eletronicoReformado;

    
    
    public VendaReformado(int idVenda, String dataVenda, String descricao, int valorFinal, Cliente cliente, EletronicoReformado eletronicoReformado) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.descricao = descricao;
        this.valorFinal = valorFinal;
        this.cliente = cliente;
        this.eletronicoReformado = eletronicoReformado;
    }
    
    
    

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(int valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EletronicoReformado getEletronicoReformado() {
        return eletronicoReformado;
    }

    public void setEletronicoReformado(EletronicoReformado eletronicoReformado) {
        this.eletronicoReformado = eletronicoReformado;
    }
   
}
