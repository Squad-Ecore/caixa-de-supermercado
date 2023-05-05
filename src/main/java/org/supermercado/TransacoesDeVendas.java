package org.supermercado;

import java.util.ArrayList;

public class TransacoesDeVendas {

    private ArrayList<Produto> itensVendidos = new ArrayList<>();

    public ArrayList<Produto> getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(ArrayList<Produto> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

}
