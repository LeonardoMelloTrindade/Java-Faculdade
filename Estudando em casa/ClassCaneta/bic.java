package javaapplication1;
        
public class bic{
    
    public static void main(String[] args) {
        
        Caneta bic = new Caneta();
           
        bic.modelo = "Bic";
        bic.cor = "Azul";
        bic.carga = 80;
        //bic.tampada = true;
        
        
        bic.tampar();
        bic.status();
        bic.rabiscar();
    }     
    
}
