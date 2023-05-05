package org.supermercado;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private boolean possuiCartaoLoja;

    public void setPossuiCartaoLoja(boolean possuiCartaoLoja) {
        this.possuiCartaoLoja = possuiCartaoLoja;
    }

    public boolean getPossuiCartaoLoja(){
        return this.possuiCartaoLoja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
