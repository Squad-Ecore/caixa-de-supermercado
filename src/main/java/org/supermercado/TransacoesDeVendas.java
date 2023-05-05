package org.supermercado;

import java.util.ArrayList;
import java.util.Date;

public class TransacoesDeVendas {
    private Date dataHora;
    private ArrayList<Produto> itensVendidos = new ArrayList<>();
    private String formaDePagamento;
    private double valorTotal;


    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public ArrayList<Produto> getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(ArrayList<Produto> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
