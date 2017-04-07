/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.Herança;

/**
 *
 * @author Jonathas
 */
public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(int idade){
        this.idade = idade + 10;        
    }


    Pessoa() {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void exibirNome(){
        System.out.println("Nome");
    }
    
}
