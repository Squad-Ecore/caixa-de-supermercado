
package org.supermercado;

import org.supermercado.dadossupermercado.DadosSupermercado;
import org.supermercado.formas.pagamentos.CartaoCredito;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DadosSupermercado.setNomeSupermercado("Dia");
        DadosSupermercado.setCnpj("5637727687347-33");

        Produto maca =
                new Produto("Maçã", "123866252FFAG", 3.89, "29/10/2024", 82);

        Produto banana =
                new Produto("Banana", "762534252FFAG", 7.89, "29/12/2024", 63);

        Produto mexerica =
                new Produto("Mexerica", "JHDTTDEGET7362", 8.45, "20/05/2027", 109);

        Produto goiaba =
                new Produto("Goiaba", "HY74736HDYEG6TETDE", 10.34, "12/12/2029", 198);

        Produto goiaba2 =
                new Produto("Goiaba tailandesa", "HY74736HDYEG6TETDE", 9,"12/12/2029", 198);

        EstoqueDeProdutos estoque = new EstoqueDeProdutos();
        estoque.adicionaProdutoAoEstoque(maca);
        estoque.adicionaProdutoAoEstoque(banana);
        estoque.adicionaProdutoAoEstoque(mexerica);
        estoque.adicionaProdutoAoEstoque(goiaba);

        Carrinho carrinho = new Carrinho();

        carrinho.adiciona(maca, 50);
        carrinho.adiciona(banana, 4);
        carrinho.remove(maca, 20);

        System.out.println(carrinho.getListaAtualDeProdutos());

        CartaoCredito cc = new CartaoCredito("76252242773532", "Marcos Oliveira Silva", 1200, carrinho);
//        System.out.println(cc.realizaPagamento());
//        System.out.println(cc.verificaPagamento());
        System.out.println(cc.geraRecibo());

        System.out.println(estoque.verificaProdutoNoEstoque(goiaba2));

        System.out.println(estoque.getProdutosEstocados());

//        System.out.println(estoque.mostraOrdemAlfabetica());
//        System.out.println(estoque.mostraPorPreco());






//        List<Double> listaPrecos = new ArrayList<>();
//        listaPrecos.add(12.9);
//
//        Double valorDouble = Double.valueOf(12.9);//autoboxing
//
//        double valorPrimitivo = valorDouble.doubleValue();//unboxing
//
//        System.out.println(listaPrecos.get(0));

    }
}
