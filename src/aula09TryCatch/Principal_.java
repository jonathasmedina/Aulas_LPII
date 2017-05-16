/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal_ {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int op = 1;
        float n1, n2, res = 0;
        boolean continuar = true;
        Calculadora c = new Calculadora();

        do {
            try {
                System.out.println("--Entre com a opção--");
                System.out.println("1 - Somar dois números");
                System.out.println("2 - Subtrair dois números");
                System.out.println("3 - Multiplicar dois números");
                System.out.println("4 - Dividir dois números");
                System.out.println("5 - Sair");

                System.out.print("Opção: ");
                op = entrada.nextInt();
                if (op >= 1 && op <= 4) {
                    System.out.print("Insira o primeiro número: ");
                    c.setN1(entrada.nextFloat());

                    System.out.print("Insira o segundo número: ");
                    c.setN2(entrada.nextFloat());

                    switch (op) {
                        case 1:
                            c.setRes(c.somar(c.getN1(), c.getN2()));
                            break;
                        case 2:
                            c.setRes(c.subtrair(c.getN1(), c.getN2()));
                            break;
                        case 3:
                            c.setRes(c.multiplicar(c.getN1(), c.getN2()));
                            break;
                        case 4:
                            c.setRes(c.dividir(c.getN1(), c.getN2()));
                            break;                        
                    }
                    System.out.println("\nResultado: " + c.getRes() + "\n");
                } else {
                    System.out.println("Digite uma opção válida.");
                }
            } catch (InputMismatchException input) {
                System.out.println("\nException: Insira NÚMERO: " + input + "\n");
                entrada.nextLine();
            } catch (ArithmeticException arit) {
                System.out.println("\nException: Erro de aritmética: " + arit + "\n");
            }
        } while (op != 5);

    }

}
