/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.cidadeBairro1__n;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class Bairro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bairro{" + "nome=" + nome + '}';
    }
    
    
}
