package dominio;

public class Servico {
    private int idServico;
    private String localServico;
    private String descricao;
    private String reparos;
    private boolean finalizado;
    private int valor;
    private String dataInicio;
    private String dataFim;
    private Cliente cliente;
    private EletronicoCliente eletronicoCliente;

    
    
    
    public Servico(int idServico, String localServico, String descricao, String reparos, boolean finalizado, int valor, String dataInicio, String dataFim, Cliente cliente, EletronicoCliente eletronicoCliente) {
        this.idServico = idServico;
        this.localServico = localServico;
        this.descricao = descricao;
        this.reparos = reparos;
        this.finalizado = finalizado;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.eletronicoCliente = eletronicoCliente;
    }
    
    
    

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getLocalServico() {
        return localServico;
    }

    public void setLocalServico(String localServico) {
        this.localServico = localServico;
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

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EletronicoCliente getEletronicoCliente() {
        return eletronicoCliente;
    }

    public void setEletronicoCliente(EletronicoCliente eletronicoCliente) {
        this.eletronicoCliente = eletronicoCliente;
    }
   
    
}
