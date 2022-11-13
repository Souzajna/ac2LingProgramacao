
package com.mycompany.cadastrocliente;

/**
 *
 * @author Gustavo Costa, Jonatas Serna, Ryan Limeira, Luis Felipe
 */
public class Cliente {

    private String nome = "";
    private String cpf = "";
    private String telefone = "";
    private String cidade = "";
    private String uf = "";
    private String email = "";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
          
    public void limpaCliente(){
       nome = "";
       cpf = "";
       telefone = "";
       cidade = "";
       uf = "";
       email= "";
    } 
}

    


