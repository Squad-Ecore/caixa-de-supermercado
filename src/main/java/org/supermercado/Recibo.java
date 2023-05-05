package org.supermercado;

public abstract class Recibo {

    public String getListaDeProdutos(){
        String retorno = "Lista de Produtos No Carrinho\n";
        for (Produto produto : listaProdutos) {
            retorno += produto.quantidadePorProdutoNoCarrinho + " " + produto.getNome() + " - " + produto.getPreco() + "\n";
        }
        return retorno;
    }
}
