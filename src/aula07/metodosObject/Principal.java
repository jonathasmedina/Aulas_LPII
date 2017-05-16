/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07.metodosObject;

import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        //p1
        /* System.out.print("Digite o nome da pessoa p1: ");
        p1.setNome(e.next());

        System.out.print("Digite a idade da pessoa p1: ");
        p1.setIdade(e.next());*/
        //p2
        /*  System.out.print("Digite o nome da pessoa p2: ");
        p2.setNome(e.next());

        System.out.print("Digite a idade da pessoa p2: ");
        p2.setIdade(e.next());

        p1 = p2;
        
        if (p1.equals(p2)) {
            System.out.println("Objeto p1 igual ao objeto p2");
        }
        if (f instanceof Pessoa) {
            System.out.println("Objeto F é uma pessoa.");
        }

        else
            System.out.println("Objetos diferentes");

        
        //System.out.println("Posição da memória de P1: " + p1);
        //System.out.println("Posição da memória de P2: " + p2);
        
        //System.out.println("HashCode do objeto P1: " + p1.hashCode());
        //System.out.println("HashCode do objeto P2: " + p2.hashCode());*/
        Funcionario f = new Funcionario();
        //f
        System.out.print("Digite o nome do funcionário f: ");
        f.setNome(e.next());

        System.out.println("" + f.getClass());

        Object obj = new Pessoa();
        Pessoa p = (Pessoa) obj;
        
        
        
    }

}
