package org.supermercado;

public interface GerenciadorDeEstoque {
    void adicionarProdutoAoEstoque(Produto produto);
    void removerProdutoDoEstoque(Produto produto);
    boolean verificaProdutoNoEstoque(Produto produto);
}
