package dominio;

public class Eletronico {
    private int id_eletronico;
    private TipoEletronico id_tipoeletronico;
    private Marca id_marca;
    private String descricao;
    private String problemas;

    public Eletronico(int id_eletronico, TipoEletronico id_tipoeletronico, Marca id_marca, String descricao, String problemas) {
        this.id_eletronico = id_eletronico;
        this.id_tipoeletronico = id_tipoeletronico;
        this.id_marca = id_marca;
        this.descricao = descricao;
        this.problemas = problemas;
    }
    
    
    
}
