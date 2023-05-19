package com.caixa.supermercado.caixasupermercadospring.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carrinho {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valorTotalCompra;

    @ManyToOne
    private Cliente cliente;

    @OneToMany
    private List<Produto> listaProdutos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void adiciona(Produto produto) {
        this.listaProdutos.add(produto);
        this.valorTotalCompra += produto.getPreco();
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque()-1);
    }

    public void adiciona(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.add(produto);
        this.valorTotalCompra += produto.getPreco() * quantidadePorProduto;
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque()-quantidadePorProduto);
    }

    public void remove(Produto produto) {
        this.listaProdutos.remove(produto);
        this.valorTotalCompra -= produto.getPreco();
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + 1);
    }

    public void remove(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.remove(produto);
        this.valorTotalCompra -= produto.getPreco() * quantidadePorProduto;
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque()+quantidadePorProduto);
    }

}