package dominio;

import java.io.Serializable;
import java.text.ParseException;
import javax.persistence.*;



@Entity
public class EletronicoReformado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEletronicoRef;
    
    @Column(length = 200)
    private String descricao;
    
    @Column(length = 200)
    private String reparos;
    
    @Column(length = 20)
    private int valor;
    
    //CRIAR OUTRA COLUNA PARA DIZER SE ELE FOI VENDIDO O NAO
    
    @ManyToOne
    @JoinColumn(name = "idTipoEletronico")
    private TipoEletronico tipo;
    
    @OneToOne ( mappedBy = "eletronicoReformado")
    @JoinColumn (name = "idEletronicoRef")
    private VendaReformado venda;

    
    
    public EletronicoReformado(){}
    
    public EletronicoReformado(String descricao, String reparos, int valor, TipoEletronico tipo) {
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

    
    
    
    
    @Override
    public String toString() {
        return tipo.toString();
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] { idEletronicoRef, this, descricao, reparos, valor};
    }
    
    public Object[] toArray2() throws ParseException {
        return new Object[] { tipo.toString(), descricao, reparos, valor};
    }
   
}
