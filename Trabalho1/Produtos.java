package com.mycompany.trabalho;

public class Produtos {
    
    private String nomeProduto;
    private float preço, tamanho;
    private boolean vendido;
    
    //GETTERS

    public String getNomeProduto() {
        return nomeProduto;
    }

    public float getTamanho() {
        return tamanho;
    }

    public float getPreço() {
        return preço;
    }

    public boolean isVendido() {
        return vendido;
    }
    
    //SETTERS

    public void setNomeproduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
           
}