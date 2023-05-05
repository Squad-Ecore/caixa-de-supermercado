package org.supermercado.dadossupermercado;

public class DadosSupermercado {
    private static String nomeSupermercado;
    private static String cnpj;

    public static String getNomeSupermercado() {
        return nomeSupermercado;
    }

    public static void setNomeSupermercado(String nomeSupermercado) {
        DadosSupermercado.nomeSupermercado = nomeSupermercado;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        DadosSupermercado.cnpj = cnpj;
    }
}
