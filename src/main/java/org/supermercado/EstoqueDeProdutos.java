package org.supermercado;

import java.util.ArrayList;
import java.util.List;

public class EstoqueDeProdutos implements GerenciadorDeEstoque {

    private List<Produto> produtosEstocados = new ArrayList<>();

    @Override
    public void adicionaProdutoAoEstoque(Produto produto) {
        produtosEstocados.add(produto);
    }

    @Override
    public void removeProdutoDoEstoque(Produto produto) {
        produtosEstocados.remove(produto);

    }

    @Override
    public boolean verificaProdutoNoEstoque(Produto produto) {
        return produtosEstocados.contains(produto);
    }

    public List<Produto> getProdutosEstocados() {
        return produtosEstocados;
    }

    public List<Produto> mostraOrdemAlfabetica(){
        produtosEstocados.sort( (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        return produtosEstocados;
    }

    public List<Produto> mostraPorPreco(){
        produtosEstocados.sort( (produto1, produto2) -> Double.compare(produto1.getPreco(), produto2.getPreco()));
        return produtosEstocados;
    }
}
