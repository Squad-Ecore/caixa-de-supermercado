package org.supermercado.formas.pagamentos;

import org.supermercado.RealizaVerificaPagamento;
import org.supermercado.Recibo;
import org.supermercado.dadossupermercado.DadosSupermercado;

import java.util.Date;

public class Pix extends RealizaVerificaPagamento implements Recibo {
    @Override
    public String geraRecibo() {
        return "\n\n\n##############################\n\nRECIBO DE PAGAMENTO\nSupermercado " +
                DadosSupermercado.getNomeSupermercado() + "\nCNPJ: " + DadosSupermercado.getCnpj() + "\n\nLista de Compras\n" +
                "\nCartão de Crédito - " + "\nTitular: " +
                "\nValor Total da Compra: R$ " + carrinho.getValorTotalCompra() + "\nData e Hora da Compra: " +
                new Date() + "\n\nOBRIGADO PELA PREFERÊNCIA!\n\n##############################";
    }
}
