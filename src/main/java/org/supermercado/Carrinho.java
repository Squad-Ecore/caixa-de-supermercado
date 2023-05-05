package org.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static List<Produto> listaProdutos = new ArrayList<>();

    public void adiciona(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.add(produto);
        produto.quantidadePorProdutoNoCarrinho = quantidadePorProduto;
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadePorProduto);
    }

    public void remove(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.remove(produto);
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidadePorProduto);
    }

    public String getListaAtualDeProdutos(){
        String retorno = "Lista de Produtos No Carrinho\n";
        for (Produto produto : listaProdutos) {
            retorno += produto.quantidadePorProdutoNoCarrinho + " " + produto.getNome() + " - R$ " + produto.getPreco() + " cada\n";
        }
        return retorno;
    }

    public static List<Produto> getListaProdutos() {
        return listaProdutos;
    }
}
