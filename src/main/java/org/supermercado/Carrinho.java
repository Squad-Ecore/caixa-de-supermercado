package org.supermercado;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adiciona(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.add(produto);
        produto.quantidadePorProdutoNoCarrinho = quantidadePorProduto;
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadePorProduto);
    }

    public void remove(Produto produto, int quantidadePorProduto) {
        this.listaProdutos.remove(produto);
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidadePorProduto);
    }

    public String getListaDeProdutos(){
        String retorno = "Lista de Produtos No Carrinho\n";
        for (Produto produto : listaProdutos) {
            retorno += produto.quantidadePorProdutoNoCarrinho + " " + produto.getNome() + " - " + produto.getPreco() + "\n";
        }
        return retorno;
    }

}
