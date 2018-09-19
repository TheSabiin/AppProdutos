package com.example.vi_ni.appprodutos;

public class Produto {
    private String nome;
    private double valor;
    private int estoque;
    private String categoria;

    public Produto(){}

    public Produto(String nome, double valor, int estoque,String categoria) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
