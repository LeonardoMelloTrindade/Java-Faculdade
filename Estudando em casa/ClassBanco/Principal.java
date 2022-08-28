package Banco;

public class Principal {
    
    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco();
        
        conta1.setNumConta(2020023677);
        conta1.abrirConta("cc");
        conta1.setDono("Leonardo");
        
        conta1.depositar(20);
        conta1.sacar(50);
        conta1.pagarMensal();
        conta1.fecharConta();
        conta1.sacar(8);
        conta1.fecharConta();
        conta1.depositar(40);
        
        conta1.statusAtual();
        
    }
    
}
