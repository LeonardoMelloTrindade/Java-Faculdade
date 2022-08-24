package com.mycompany.rangers;

public class Principal {
    
    public static void main(String[] args) {
        
        PowerRangers ranger1 = new RangerAzul();
        PowerRangers ranger2 = new RangerVermelho();
        
        ranger2.morfar();
        ranger1.morfar();
        
        System.out.println("Cor do uniforme: " + ranger1.getCor());
        System.out.println("Cor do uniforme: " + ranger2.getCor());
        
    }
    
}
