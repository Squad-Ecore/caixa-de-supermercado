package org.supermercado.formas.pagamentos;

import org.supermercado.Carrinho;
import org.supermercado.FormaDePagamento;
import org.supermercado.Produto;
import org.supermercado.Recibo;
import org.supermercado.dadossupermercado.DadosSupermercado;

import java.util.ArrayList;
import java.util.Date;

public class CartaoCredito extends Recibo implements FormaDePagamento {
    private String numeroDoCartao;
    private String nomeDoTitular;
    private String dataDeValidade;
    private String codigoDeSeguranca;
    private String listaProdutosComprado;

    public CartaoCredito(String numeroDoCartao, String nomeDoTitular, String dataDeValidade, String codigoDeSeguranca) {
        this.numeroDoCartao = numeroDoCartao;
        this.nomeDoTitular = nomeDoTitular;
        this.dataDeValidade = dataDeValidade;
        this.codigoDeSeguranca = codigoDeSeguranca;

    }

    @Override
    public boolean realizaPagamento() {

        ArrayList<Produto> listaDeProdutos = (ArrayList<Produto>) Carrinho.getListaProdutos();
        String listaProdutosComprado = "";

        for (Produto produto : listaDeProdutos) {
            super.valorTotal += produto.getQuantidadePorProdutoNoCarrinho() * produto.getPreco();
            listaProdutosComprado += produto.getQuantidadePorProdutoNoCarrinho() + " " + produto.getNome() + " - R$ " + produto.getPreco() + " cada\n";
            this.listaProdutosComprado = listaProdutosComprado;
        }

        System.out.println("Processando pagamento de R$ " + super.getValorTotal() + " com cartão " + numeroDoCartao);
        System.out.println("Autorizando transação...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Transação aprovada!");
        return true;
    }

    @Override
    public boolean verificaPagamento() {
        System.out.println("Pagamento por cartão aprovado!!!!!!!!!!!!!!!");
        return true;
    }

    @Override
    public String geraRecibo(Carrinho carrinho) {
        String retorno =
                "\n\n\n##############################\n\nRECIBO DE PAGAMENTO\nSupermercado " +
                        DadosSupermercado.getNomeSupermercado() + "\nCNPJ: " + DadosSupermercado.getCnpj() + "\n\nLista de Compras\n";

        setDataHora(new Date());
        retorno += listaProdutosComprado;
        setDataHora(new Date());
        retorno += "\nCartão de Crédito - " + numeroDoCartao + "\nTitular: " + nomeDoTitular;
        retorno += "\nValor Total da Compra: R$ " + getValorTotal() + "\nData e Hora da Compra: " +
                getDataHora() + "\n\nOBRIGADO PELA PREFERÊNCIA!\n\n##############################";
        return retorno;
    }
}
