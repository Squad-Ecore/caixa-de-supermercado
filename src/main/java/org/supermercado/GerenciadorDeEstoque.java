package org.supermercado;

public interface GerenciadorDeEstoque {
    void adicionaProdutoAoEstoque(Produto produto);
    void removeProdutoDoEstoque(Produto produto);
    boolean verificaProdutoNoEstoque(Produto produto);
}
