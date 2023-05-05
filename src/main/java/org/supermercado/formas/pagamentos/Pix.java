package org.supermercado.formas.pagamentos;

import org.supermercado.Carrinho;
import org.supermercado.FormaDePagamento;
import org.supermercado.Produto;
import org.supermercado.Recibo;
import org.supermercado.dadossupermercado.DadosSupermercado;

import java.util.ArrayList;
import java.util.Date;

public class Pix extends Recibo implements FormaDePagamento {
    @Override
    public boolean realizaPagamento() {
        return false;
    }

    @Override
    public boolean verificaPagamento() {
        return false;
    }

    @Override
    public String geraRecibo(Carrinho carrinho) {
        String retorno =
                "Recibo de Pagamento\nSupermercado " + DadosSupermercado.getNomeSupermercado() + "\nCNPJ: " + DadosSupermercado.getCnpj() + "\n\nLista de produtos Vendidos\n";
        setDataHora(new Date());
        ArrayList<Produto> listaDeProdutos = (ArrayList<Produto>) carrinho.getListaProdutos();

        for (Produto produto : listaDeProdutos) {
            retorno += produto.getQuantidadePorProdutoNoCarrinho() + " " + produto.getNome() + " - " + produto.getPreco() + " cada\n";
            setValorTotal(getValorTotal() + produto.getQuantidadePorProdutoNoCarrinho() * produto.getPreco());
        }
        setDataHora(new Date());
        retorno += "\nValor Total da Compra: " + getValorTotal() + "\nData e Hora da Compra: " + getDataHora() + "\n\n OBRIGADO PELA PREFERÊNCIA!";
        return retorno;
    }
}
