package com.caixa.supermercado.caixasupermercadospring.form;

import com.caixa.supermercado.caixasupermercadospring.model.Produto;
import com.caixa.supermercado.caixasupermercadospring.repository.ProdutoRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizaProdutoForm {

    @NotNull @NotEmpty @Length(min = 1)
    private String nome;
    @NotNull
    private double preco;
    @NotNull
    private int quantidadeEmEstoque;
    @NotNull @NotEmpty
    private String codigoDeBarras;
    @NotNull @NotEmpty
    private String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
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

    public Produto atualizaProduto(Long id, ProdutoRepository produtoRepository) {
        Produto produto = produtoRepository.getReferenceById(id);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
        produto.setCodigoDeBarras(codigoDeBarras);
        produto.setDataDeValidade(dataDeValidade);
        return produto;
    }
}
