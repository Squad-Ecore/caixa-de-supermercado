package com.caixa.supermercado.caixasupermercadospring.dto;

import com.caixa.supermercado.caixasupermercadospring.model.Produto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private LocalDate dataDeValidade;

    public ProdutoDto(Produto produto) {
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidadeEmEstoque = produto.getQuantidadeEmEstoque();
        this.dataDeValidade = produto.getDataDeValidade();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public static List<ProdutoDto> conversorDeLista(List<Produto> produtos) {
        return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
    }
}
