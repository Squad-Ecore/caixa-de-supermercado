package org.supermercado;

import java.util.List;

public interface Recibo {

    List<Produto> listaDeProdutos = Carrinho.getListaProdutos();

    String geraRecibo();
}

