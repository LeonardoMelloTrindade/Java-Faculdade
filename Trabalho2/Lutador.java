package com.mycompany.trabalho;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private float altura;
    private float peso;
    private int vitorias;
    private int empates;
    private int derrotas;

    //MÉTODOS PUUBLICOS

    public void apresentar() {
        System.out.println("-------------------------------------------");
        System.out.println("Lutador: " + this.getNome() + ".");
        System.out.println("Nacionalidade: " + this.getNacionalidade() + ".");
        System.out.println("Idade: " + this.getIdade()+ ".");
        System.out.println("Altura: " + this.getAltura()+ ".");
        System.out.println("Pesando: " + this.getPeso()+ ".");
        System.out.println("Gahou: " + this.getVitorias()+ ".");
        System.out.println("Perdeu: " + this.getDerrotas()+ ".");
        System.out.println("Empatou: " + this.getEmpates()+ ".");
        System.out.println("-------------------------------------------");
        
    }

    public void Status() {
        System.out.println("O lutador " + this.getNome() + " é peso " + this.getCategoria());
          
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {  
        this.setDerrotas(this.getDerrotas() + 1); 
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+ 1); 
    }
    
//CONSTRUTOR
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }
    
    //GETTERS
    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
    
    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public void setCategoria() {
       if (this.peso < 52.2) {
           this.categoria = "Inválido";
       }
      
       else if (this.peso <= 70.3) {
           this.categoria = "Leve";
       }
       
       else if (this.peso <= 83.9) {
           this.categoria = "Médio";
       }
       else if (peso < 120.1){
           this.categoria = "Pesado";
       }
       else {
           this.categoria = "Inválido";
       }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
       
}
