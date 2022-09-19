package com.mycompany.trabalho;

public class Principal {

    public static void main(String[] args) {
       
        Venda produto1 = new Venda("Joao", "Jorge");
        //Produtos produto1 = new Produtos();
        
        produto1.setNomeproduto("estante");
        produto1.setPreço(350.65f);
        produto1.setTamanho(70.2f);
        produto1.setVendido(false);
        produto1.cancelarVenda();
        
        System.out.println("=-=-=-=-=-=-=--=-=-=-=");
        
        Venda produto2 = new Venda("Luis", "Pedro");
        
        produto2.setNomeproduto("televisao");
        produto2.setPreço(1500.90f);
        produto2.setTamanho(25);
        produto2.setVendido(true);
        produto2.concretizarVenda();
        
        
        
    }
    
    
    
}