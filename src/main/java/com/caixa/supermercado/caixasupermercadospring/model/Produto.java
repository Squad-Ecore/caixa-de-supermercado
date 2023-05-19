package com.caixa.supermercado.caixasupermercadospring.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String codigoDeBarras;
    private int quantidadeEmEstoque;
    private double preco;
    private LocalDate dataDeValidade;

    @ManyToOne
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, int quantidadeEmEstoque, double preco, Categoria categoria) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
        this.categoria = categoria;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Long getId() {
        return id;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public boolean equals(Object referencia) {
        Produto produto = (Produto) referencia;
        if (this.getCodigoDeBarras() == produto.getCodigoDeBarras() && this.getNome() == produto.getNome())
            return true;
        return false;
    }
    //depende da minha regra de negócio

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "IdProduto: " + id + "\n" +
                "CodigoDeBarras: " + codigoDeBarras + "\n" +
                "Preco: R$ " + preco + "\n" +
                "DataDeValidade: " + dataDeValidade + "\n" +
                "QuantidadeEmEstoque: " + quantidadeEmEstoque + "\n" +
                "-----------------------------------------" + "\n";
    }

}
