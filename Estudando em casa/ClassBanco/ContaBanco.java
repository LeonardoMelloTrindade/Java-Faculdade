package Banco;

public class ContaBanco {
    
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //CONSTRUTOR
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }
    
    //STATUS ATUAL
    
    public void statusAtual(){
        
        System.out.println("--------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("--------------------------------------");
        
    }
    
    //SETTERS E GETTERS
    
    //NUMCONTA
    public void setNumConta(int num){
       this.numConta = num;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    //TIPO
    public void setTipo(String tipo){
       this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    //DONO
    public void setDono(String dono){
       this.dono = dono;
    }    
       
    public String getDono(){
        return this.dono;
    }
    
    //SALDO
    public void setSaldo(float saldo){
       this.saldo= saldo;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    
    public void setStatus(boolean status){
       this.status = status;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    //MÉTODOS
    
    public void abrirConta(String localTipo){
        this.setTipo(localTipo);
        this.setStatus(true);
        if ("cc".equals(tipo)){
             
            this.saldo = 50;
            System.out.println("Conta aberta com sucesso.");
        }
        else if ("cp".equals(tipo)){
            
            this.saldo = 150;
            System.out.println("Conta aberta com sucesso.");
        }
        else {
            System.out.println("Digite corretamente...");
        } 
    }
    
    public void fecharConta( ){
        if (saldo > 0){
            System.out.println("Nao e possivel fechar, pois esta com dinheiro.");
        }
        else if (saldo < 0){
            System.out.println("Conta com saldo negativo, nao e possivel fechar.");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
        
    }
    
    public void depositar(float deposito){
        if (this.getStatus() == true){
            
            this.setSaldo(this.getSaldo() + deposito);
        }
        else{
            System.out.println("Conta está fechada.");
        }
    }
    
    public void sacar(float valor){
        if (this.getStatus() == true && saldo >= valor){
            
            this.setSaldo(this.getSaldo() - valor);
        }
        else{
            System.out.println("Impossível sacar.");
        }
    } 
    
    public void pagarMensal(){
        if (this.getStatus() == true){
            if ("cc".equals(tipo) && this.getSaldo() > 12){
                
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Mensalidade paga na conta-corrente.");
            }
            else if ("cp".equals(tipo) && this.getSaldo() > 20){
                
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Mensalidade paga na conta-poupança.");
            }
        }
        else {
            System.out.println("Conta fechada ou saldo insuficiente.");
        }
        
    
    }
            
}
