/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09TryCatch;

import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {

        int i;
        int x[] = new int[10];

        try {
            //i = 100 / 0;
            x[150] = 2500;

        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Posição inexistente no vetor");
        } finally {
            System.out.println("No finally, independentemente dos erros...");
        }
        System.out.println("Fora do try-catch-finally");
    }
}
