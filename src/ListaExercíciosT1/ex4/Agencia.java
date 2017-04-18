/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex4;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class Agencia {
    private int codAgencia;
    private String nomeAgencia;
    private ArrayList<ContaCorrente> arrayContaCorrente;
    private ArrayList<ContaPoupanca> arrayContaPoupanca;
    private ArrayList<Gerente> arrayGerente;

    public int getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(int codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public ArrayList<Gerente> getArrayGerente() {
        return arrayGerente;
    }

    public void setArrayGerente(ArrayList<Gerente> arrayGerente) {
        this.arrayGerente = arrayGerente;
    }

    public ArrayList<ContaCorrente> getArrayContaCorrente() {
        return arrayContaCorrente;
    }

    public void setArrayContaCorrente(ArrayList<ContaCorrente> arrayContaCorrente) {
        this.arrayContaCorrente = arrayContaCorrente;
    }

    public ArrayList<ContaPoupanca> getArrayContaPoupanca() {
        return arrayContaPoupanca;
    }

    public void setArrayContaPoupanca(ArrayList<ContaPoupanca> arrayContaPoupanca) {
        this.arrayContaPoupanca = arrayContaPoupanca;
    }
    
    
}
