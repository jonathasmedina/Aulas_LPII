/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.cidadeBairro1__n.cidadeBairro1__nVersãoSimplificada;

import aula04.cidadeBairro1__n.*;
import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class Cidade {
    private String nome;
    private int populacao; 
    private ArrayList<Bairro> bairro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public ArrayList<Bairro> getBairro() {
        return bairro;
    }

    public void setBairro(ArrayList<Bairro> bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", populacao=" + populacao + ", bairro=" + bairro + '}';
    }
    
    
}
