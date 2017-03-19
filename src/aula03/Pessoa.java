/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Jonathas
 */
public class Pessoa {

    String pessoa;
    int idade;
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //setters
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    //getters
    public String getPessoa() {
        return pessoa;
    }

    public int getIdade() {
        return idade;
    }
}
