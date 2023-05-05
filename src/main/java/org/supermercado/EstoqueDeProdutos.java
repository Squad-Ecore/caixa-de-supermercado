package org.supermercado;

import java.util.ArrayList;
import java.util.List;

public class EstoqueDeProdutos implements GerenciadorDeEstoque {

    private List<Produto> produtosEstocados = new ArrayList<>();

    @Override
    public void adicionarProdutoAoEstoque(Produto produto) {
        produtosEstocados.add(produto);
    }

    @Override
    public void removerProdutoDoEstoque(Produto produto) {
        produtosEstocados.remove(produto);
    }

    @Override
    public boolean verificaProdutoNoEstoque(Produto produto) {
        for (Produto iterador : produtosEstocados) {
            if (produto == iterador) {
                return true;
            }
        }
        return false;
    }

    public String getProdutosEstocados() {
        String retorno = "";
        for (Produto produto : produtosEstocados) {
            retorno += "Nome: " + produto.getNome() + " - Preço - R$ " + produto.getPreco() + "\n";
        }
        return retorno;
    }
}
