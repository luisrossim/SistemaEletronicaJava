package dominio;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class Servico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServico;
    
    @Column(length = 50)
    private String localServico;
    
    @Column(length = 200)
    private String descricao;
    
    @Column(length = 200) 
    private String reparos;
    
    @Column(nullable = false)
    private boolean finalizado;
    
    @Column(length = 20)
    private int valor;
     
    @Column(length = 10)
    private String dataInicio;
    
    @Column(length = 10)
    private String dataFim;
    
    @ManyToOne ( fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @ManyToOne ( fetch = FetchType.EAGER)
    @JoinColumn (name = "idEletronicoCli")
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
