
package org.supermercado;

import org.supermercado.dadossupermercado.DadosSupermercado;
import org.supermercado.formas.pagamentos.CartaoCredito;

public class Main {
    public static void main(String[] args) {

        DadosSupermercado.setNomeSupermercado("Dia");
        DadosSupermercado.setCnpj("5637727687347-33");

        Produto maca =
                new Produto("Maçã", "123866252FFAG", 3.89, "29/10/2024", 82);

        Produto banana =
                new Produto("Banana", "762534252FFAG", 7.89, "29/12/2024", 63);

        EstoqueDeProdutos estoque = new EstoqueDeProdutos();
        estoque.adicionarProdutoAoEstoque(maca);
        estoque.adicionarProdutoAoEstoque(banana);

        Carrinho carrinho = new Carrinho();

        carrinho.adiciona(maca, 3);
        carrinho.adiciona(banana, 4);

        CartaoCredito cc = new CartaoCredito("76252242773532", "Marcos Oliveira Silva", "09/2028", "142ewd");
        System.out.println(cc.realizaPagamento());
        System.out.println(cc.verificaPagamento());
        System.out.println(cc.geraRecibo(carrinho));


    }
}
