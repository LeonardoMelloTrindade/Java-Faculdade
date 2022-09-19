package com.mycompany.trabalho;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        
        if (lutador1.getCategoria().equals(lutador2.getCategoria())
                && lutador1 != lutador2){
            
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
            
        } else {
            
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            
        }
    }
    
    public void lutar(){
        
        if (this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor) {
                case 0 ->  {
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 ->  {
                    System.out.println("venceu " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 ->  {
                    System.out.println("vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }
            
            
        } else {
            System.out.println("A luta nao vai rolar");
        }
    
    }
    
    //GETTERS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    
    //SETTERS

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}