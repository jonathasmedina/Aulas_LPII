/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        Kevin k = new Kevin();
        ArrayList<Personalidade> p = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Personalidade per = new Personalidade();
            System.out.println("Digite a descrição da personalidade " + (i + 1) + ":");
            String personalidade = e.next();            
            per.setDescricao(personalidade);
            p.add(per);
        }

        //vinculando as personalidades a Kevin
        k.setPersonalidades(p);

        Random gerador = new Random();
        int numero = gerador.nextInt(5);
        System.out.println("A personalidade de kevin no momento é: " +k.getPersonalidades().get(numero).getDescricao());

    }

}
