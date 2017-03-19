/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import Aula01.Classe2;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 * ex1 Calcular e exibir a média - ex2: aprovado/rep
 */
public class Classe1_media {
     public static void main(String[] args) {      
         
         float n1, n2, n3;
         Scanner e = new Scanner(System.in);
         Classe2_media classe2_media = new Classe2_media();
         
         System.out.println("Digite a primeira nota: ");
         n1 = e.nextFloat();
         
         System.out.println("Digite a segunda nota: ");
         n2 = e.nextFloat();
         
         System.out.println("Digite a terceira nota: ");
         n3 = e.nextFloat();
         
         //classe2_media.calcular_exibir(n1, n2, n3);         
         //para o ex2: retornar a média
         float media = classe2_media.calcular_exibir(n1, n2, n3);
         
         System.out.println("Insira nome: ");
         classe2_media.nome = e.next();
         System.out.println("Insira idade: ");
         classe2_media.idade = e.nextInt();
         
         //classe2_media.cod = e.nextInt();
         //classe2_media.turma = e.nextInt();
         
         classe2_media.verAp(media);         
        
    }
}
