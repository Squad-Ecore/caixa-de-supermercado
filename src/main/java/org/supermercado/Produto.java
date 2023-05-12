package org.supermercado;

public class Produto {

    protected int quantidadePorProdutoNoCarrinho;
    private int idProduto;
    private String codigoDeBarras;
    private String nome;
    private double preco;
    private String dataDeValidade;
    private int quantidadeEmEstoque;
    private static int total;

    public Produto(String nome, String codigoDeBarras, double preco, String dataDeValidade, int quantidadeEmEstoque) {
        this.dataDeValidade = dataDeValidade;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        Produto.total = getTotal() + 1;
        this.idProduto = Produto.total;
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

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidadePorProdutoNoCarrinho() {
        return quantidadePorProdutoNoCarrinho;
    }

    @Override
    public boolean equals(Object referencia) {
        Produto produto = (Produto) referencia;
        if (this.getCodigoDeBarras() == produto.getCodigoDeBarras())
            return true;
        return false;
    }
    //depende da minha regra de negócio

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "IdProduto: " + idProduto + "\n" +
                "CodigoDeBarras: " + codigoDeBarras + "\n" +
                "Preco: R$ " + preco + "\n" +
                "DataDeValidade: " + dataDeValidade + "\n" +
                "QuantidadeEmEstoque: " + quantidadeEmEstoque + "\n" +
                "-----------------------------------------" + "\n";
    }
}