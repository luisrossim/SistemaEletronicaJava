package dominio;

import java.text.ParseException;
import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nome;
    private String telefone;  
    private String cpf;  
    private char sexo;
    private String email;
    private Cidade cidade;

    public Cliente(String nome, String telefone, String cpf, char sexo, String email, Cidade cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.cidade = cidade;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
    
    public Object[] toArray() throws ParseException {
        return new Object[] { this, cidade};
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
