package org.supermercado;

import java.time.LocalDate;
import java.util.Scanner;

public class Produto {

    private int idProduto;
    private String codigoDeBarras;
    private String nome;
    private double preco;
    private InformacoesAdicionais informacoesAdicionais;
    private static int total;

    public Produto(String nome, String codigoDeBarras, double preco) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        Produto.total = getTotal() + 1;
        this.idProduto = Produto.total;
    }

    public InformacoesAdicionais setInformacoesProduto(String dataDeValidade, int quantidadeEmEstoque, String categoria) {
        InformacoesAdicionais informacoesAdicionais1 = new InformacoesAdicionais();
        informacoesAdicionais1.setCategoria(categoria);
        informacoesAdicionais1.setDataDeValidade(dataDeValidade);
        informacoesAdicionais1.setQuantidadeEmEstoque(quantidadeEmEstoque);
        this.informacoesAdicionais = informacoesAdicionais1;
        InformacoesAdicionais retorna = informacoesAdicionais1;
        return retorna;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public static int getTotal() {
        return total;
    }

    public int getIdProduto() {
        return idProduto;
    }
}