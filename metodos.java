package CanetaB;

public class metodos {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        Caneta c3 = new Caneta();
        Caneta c4 = new Caneta("Faber Castell", "Rosa", 0.8f);
        
        //Métodos acessores e modificadores
        c1.setPonta(0.5f);
        c1.setModelo("Bic");
        System.out.println("C1");
        c1.status();
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        //c2.modelo = "Waterman"; Não vai ser permitido porque é privado 
        //c2.ponta = "0.2f"; Não vai ser permitido porque é privado 
        
        c2.setModelo("Waterman");
        c2.setPonta(0.2f);
        System.out.println("C2");
        System.out.println("A caneta " + c2.getModelo() + " de ponta " + c2.getPonta() + ".");
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        System.out.println("C3");
        c3.status();
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        System.out.println("C4");
        c4.status();
    }
    
}
