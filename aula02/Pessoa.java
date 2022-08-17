package com.mycompany.aula02;

import java.util.Date;

/**
 *
 * @Leozinho
 */
public class Pessoa {
    /* NOME DE ATRIBUTO COMEÇA COM LETRA MINUSCULA*/
    String cpf;
    String nome;
    String sobrenome;
    Endereco endereco;
    Date dataNascimento;
    
    public Pessoa(String nomeParametro) {
        this.nome = nomeParametro;
        
    }
    
    public Pessoa() {
        
    }
}
