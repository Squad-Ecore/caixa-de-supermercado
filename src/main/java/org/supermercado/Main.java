
package org.supermercado;

public class Main {
    public static void main(String[] args) {

        Produto maca = new Produto("Maçã", "123866252FFAG", 3.89);
        System.out.println(maca.getIdProduto());

        System.out.println(Produto.getTotal());

        InformacoesAdicionais macaInformacoes =
                maca.setInformacoesProduto("02/12/2024", 85,"alimentação");
        System.out.println(macaInformacoes.getDataDeValidade());




    }
}
