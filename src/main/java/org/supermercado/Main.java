
package org.supermercado;

public class Main {
    public static void main(String[] args) {

        Produto maca =
                new Produto("Maçã", "123866252FFAG", 3.89, "29/10/2024", 82);

        Produto banana =
                new Produto("Banana", "762534252FFAG", 7.89, "29/12/2024", 63);

        EstoqueDeProdutos estoque = new EstoqueDeProdutos();

        estoque.adicionarProdutoAoEstoque(maca);
        System.out.println(estoque.verificaProdutoNoEstoque(banana));
        System.out.println(estoque.getProdutosEstocados());

    }
}
