package org.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static List<Produto> listaProdutos = new ArrayList<>();
    private static double valorTotalCompra;

    public void adiciona(Produto produto) {
        this.listaProdutos.add(produto);
        produto.quantidadePorProdutoNoCarrinho = 1; produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - 1);
    }

    public void adiciona(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.add(produto);
        produto.quantidadePorProdutoNoCarrinho = quantidadePorProduto; produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadePorProduto);
    }

    public void remove(Produto produto) {
        this.listaProdutos.remove(produto);
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + 1);
    }

    public void remove(Produto produto, int quantidadePorProduto) {
        if (produto.quantidadePorProdutoNoCarrinho <= quantidadePorProduto)
            this.listaProdutos.remove(produto);
        else {
            produto.quantidadePorProdutoNoCarrinho -= quantidadePorProduto;
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidadePorProduto);
        }
    }

    public String getListaAtualDeProdutos() {
        String retorno = "";
        for (Produto produto : listaProdutos) {
            retorno += produto.quantidadePorProdutoNoCarrinho + " " + produto.getNome() + " - R$ " + produto.getPreco() + " cada\n";
        }
        return retorno;
    }

    public static List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    private double CalculaValorTotalCompra() {
        valorTotalCompra = 0;
        this.listaProdutos.forEach(produto -> valorTotalCompra += produto.getPreco() * produto.quantidadePorProdutoNoCarrinho);
        return valorTotalCompra;
    }

    public double getValorTotalCompra() {
        return CalculaValorTotalCompra();
    }
}
