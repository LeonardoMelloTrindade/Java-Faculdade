package com.mycompany.trabalho;

public class Principal {

    public static void main(String[] args) {
        
        Lutador lutadores[] = new Lutador[2];
        lutadores[0] = new Lutador("Ryu", "Japao", 30, 1.75f, 85, 45, 2, 2);
        lutadores[1] = new Lutador("Ken", "Estados Unidos", 31, 1.75f, 83, 44, 2, 3);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores[0], lutadores[1]);
        UEC01.lutar();
        lutadores[0].Status();
        lutadores[1].Status();
    }
}