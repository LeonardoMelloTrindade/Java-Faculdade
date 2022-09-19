package com.mycompany.trabalho;

public class Venda extends Produtos {
    
    private String nomeComprador, nomeVendedor;
    private Produtos produto;
    
    //GETTERS

    public String getNomeComprador() {
        return nomeComprador;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }
    
    //SETTERS

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
    
    //CONSTRUTOR
    
    public Venda(String comprador, String vendedor) {
    
        this.setNomeComprador(comprador);
        this.setNomeVendedor(vendedor);
        
    }
                
    //cancelar venda 
    
    public void cancelarVenda() {
        if (isVendido() == false) {           
            System.out.println("A venda do produto " + getNomeProduto() + " no valor de R$ " + getPreço() + " foi cancelada no nome de " + getNomeComprador() + ".");        
        }
    
    }
    
    //confirmar venda[print recibo]
    
    public void concretizarVenda(){
        if (isVendido() == true){
            System.out.println("A compra do produto " + getNomeProduto() + " no valor de R$" + getPreço() + "  foi aprovada no nome de " + getNomeComprador() + ".");       
        }
        
    }
    
}