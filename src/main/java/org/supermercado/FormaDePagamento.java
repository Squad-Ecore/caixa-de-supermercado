package org.supermercado;

public interface FormaDePagamento {

    boolean realizaPagamento(double valor);
    boolean verificaPagamento();
    Recibo fornecerRecibo();
}

