package org.supermercado;

public abstract class RealizaVerificaPagamento {
    protected double saldo;
    protected Carrinho carrinho;

    public boolean realizaPagamento() {
        if (carrinho.getValorTotalCompra() <= this.saldo)
            return true;
        return false;
    }

    public boolean verificaPagamento() {
        if (realizaPagamento())
            return true;
        return false;
    }

}
