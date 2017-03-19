/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Jonathas
 * Aula02 - 03 getters and setters
 */
public class Classe1 {
    
    public static void main (String[] args){
        Scanner e = new Scanner(System.in);
        
        //String nome;
        //int idade;
        
        System.out.println("Informe o nome:");
        nome = e.next();
        System.out.println("Informe a idade: ");
        idade = e.nextInt();
        
        System.out.println("Variáveis locais da classe: "+ nome + ", " + idade);
        
        String nome = "IFMS";
        int idade = 10;
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setPessoa(nome);
        pessoa.setIdade(idade);
        
        System.out.println("Variáveis do objeto criado: " + 
                pessoa.getPessoa() + ", " + 
                pessoa.getIdade());
        
    }
            
    
}
