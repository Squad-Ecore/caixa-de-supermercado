package org.supermercado;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adiciona(Produto produto) {
        this.listaProdutos.add(produto);
    }

    public void remove(Produto produto) {
        this.listaProdutos.remove(produto);
    }


}
