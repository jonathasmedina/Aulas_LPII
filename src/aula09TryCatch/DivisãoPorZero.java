/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09TryCatch;

import com.sun.org.apache.xpath.internal.operations.Quo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class DivisãoPorZero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                System.out.print("Entre com um numerador inteiro: ");
                int num = entrada.nextInt();

                System.out.print("Entre com um denominador inteiro: ");
                int den = entrada.nextInt();

                int result = quociente(num, den);

                System.out.println("Resultado: " + num + den + result);

                continuar = false;
            } catch (InputMismatchException erroTipo) {
                System.out.println("Erro!");
                entrada.nextLine();
                System.out.println("Entre com números inteiros.");

            } catch (ArithmeticException erroAritm) {
                System.out.println("Erro");
                System.out.println("Zero não pode ser denominador.");
            }
        } while (continuar);
    }

    public static int quociente(int num, int den) throws ArithmeticException {
        return num / den;
    }

}
