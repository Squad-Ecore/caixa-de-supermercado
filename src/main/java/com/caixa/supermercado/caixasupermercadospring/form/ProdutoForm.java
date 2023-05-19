package com.caixa.supermercado.caixasupermercadospring.form;

import com.caixa.supermercado.caixasupermercadospring.model.Produto;
import com.caixa.supermercado.caixasupermercadospring.repository.CategoriaRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProdutoForm {

    @NotNull @NotEmpty
    private String nome;
    @NotNull
    private double preco;
    @NotNull
    private int quantidadeEmEstoque;
    @NotNull @NotEmpty
    private String codigoDeBarras;
    @NotNull @NotEmpty
    private String nomeCategoria;
    @NotNull @NotEmpty
    private String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Produto conversor(CategoriaRepository categoria){
        return new Produto(nome, quantidadeEmEstoque, preco, categoria.findByNome(nomeCategoria), dataDeValidade);
    }
}
