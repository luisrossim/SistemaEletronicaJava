package dominio;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class VendaReformado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;
    
    @Column(length = 10)
    private String dataVenda;
    
    @Column(length = 200)
    private String descricao;
    
    @Column(length = 20)
    private int valorFinal;
    
    @ManyToOne ( fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idEletronicoRef")
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
