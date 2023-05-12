package org.supermercado.formas.pagamentos;

import org.supermercado.Carrinho;
import org.supermercado.RealizaVerificaPagamento;
import org.supermercado.Recibo;
import org.supermercado.dadossupermercado.DadosSupermercado;

import java.util.Date;

public class CartaoCredito extends RealizaVerificaPagamento implements Recibo {
    private String numeroDoCartao;
    private String nomeDoTitular;

    public CartaoCredito(String numeroDoCartao, String nomeDoTitular, double saldo, Carrinho carrinho) {
        this.numeroDoCartao = numeroDoCartao;
        this.nomeDoTitular = nomeDoTitular;
        super.saldo = saldo;
        super.carrinho = carrinho;
    }

    @Override
    public String geraRecibo() {
        if (super.verificaPagamento())
            return "\n\n\n##############################\n\nRECIBO DE PAGAMENTO\nSupermercado " +
                    DadosSupermercado.getNomeSupermercado() + "\nCNPJ: " + DadosSupermercado.getCnpj() + "\n\nLista de Compras\n" +
                    carrinho.getListaAtualDeProdutos() + "\nCartão de Crédito - " + numeroDoCartao + "\nTitular: " + nomeDoTitular +
                    "\nValor Total da Compra: R$ " + carrinho.getValorTotalCompra() + "\nData e Hora da Compra: " +
                    new Date() + "\n\nOBRIGADO PELA PREFERÊNCIA!\n\n##############################";

        return "Saldo Insuficiente para realizar pagamento";
    }

}
