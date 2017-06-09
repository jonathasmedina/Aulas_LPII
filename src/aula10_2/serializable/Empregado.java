/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_2.serializable;

import java.io.Serializable;

/**
 *
 * @author Jonathas
 */
public class Empregado implements Serializable {
   private static final long serialVersionUID = 7725273776407288325L;
   
   
   public String nome;
   public String endereco;
   public int numero;
   private transient int SSN;
  
   
   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
   
   public void enviarEmail() {
      System.out.println("Enviar email para: " + nome + " " + endereco);
   }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
}
