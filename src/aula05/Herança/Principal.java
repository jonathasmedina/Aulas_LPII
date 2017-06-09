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
public class Principal {
     public static void main(String[] args) {
         
         Pessoa p1 = new Pessoa(10);
         Pessoa p2 = new Pessoa();
         
         
         
         Funcionario f = (Funcionario) new Pessoa(10);
         System.out.println(f.getIdade());
         
         p2.setIdade(10);
         
         System.out.println("Idade p1: " + p1.getIdade());
         System.out.println("Idade p2: " + p2.getIdade());
         
         p2 = p1;
         
//         if(p1.equals(p3))
     //        System.out.println("Objetos iguais");
     //    else
       //      System.out.println("Objetos diferentes");
         
     }
        
}
