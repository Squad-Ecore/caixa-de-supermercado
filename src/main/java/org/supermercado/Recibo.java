package org.supermercado;

import org.supermercado.dadossupermercado.DadosSupermercado;

import java.util.ArrayList;
import java.util.Date;

public abstract class Recibo {

    private Date dataHora;
    protected static double valorTotal;

    public String geraRecibo(Carrinho carrinho){
        String retorno =
                "Recibo de Pagamento\nSupermercado " + DadosSupermercado.getNomeSupermercado() + "\nCNPJ: " + DadosSupermercado.getCnpj() + "\n\nLista de produtos Vendidos\n";
        setDataHora(new Date());
        ArrayList<Produto> listaDeProdutos = (ArrayList<Produto>) carrinho.getListaProdutos();

        for (Produto produto : listaDeProdutos) {
            retorno += produto.getQuantidadePorProdutoNoCarrinho() + " " + produto.getNome() + " - " + produto.getPreco() + " cada\n";
        }
        setDataHora(new Date());
        retorno += "\nValor Total da Compra: R$ " + getValorTotal() + "\nData e Hora da Compra: " + getDataHora() + "\n\n OBRIGADO PELA PREFERÊNCIA!";
        return retorno;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
