package org.supermercado.formas.pagamentos;

import org.supermercado.FormaDePagamento;

public class Pix implements FormaDePagamento {
    @Override
    public boolean realizaPagamento(double valor) {
        return false;
    }

    @Override
    public boolean verificaPagamento() {
        return false;
    }
}
