/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.cidadeBairro1__n.cidadeBairro1__nVersãoSimplificada;

import aula04.cidadeBairro1__n.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 * Exercício cidade-centro com uma única cidade
 */
public class Principal {

    public static void main(String[] args) {


        Scanner e = new Scanner(System.in);
        Scanner e2 = new Scanner(System.in);

        Cidade cidade = new Cidade();
        
        
        ArrayList<Bairro> listaBairros = new ArrayList<>();

        System.out.println("Insira o nome da cidade: ");
        cidade.setNome(e.nextLine());

        System.out.println("População: ");
        cidade.setPopulacao(e2.nextInt());

        for (int i = 0; i < 4; i++) {
            Bairro bairro = new Bairro();

            System.out.println("Insira o nome do bairro: ");
            bairro.setNome(e.nextLine());
            
            System.out.println("População do bairro: ");
            bairro.setPopulacao(e2.nextInt());
            listaBairros.add(bairro);
        }

        cidade.setBairro(listaBairros);
        System.out.println("A cidade " +cidade.getNome()+ " contém os seguintes bairros: "
            +cidade.getBairro().toString());
        
        int popCid = 0, popBairros = 0;
        
        popCid = cidade.getPopulacao();
        
        for (Bairro pop : listaBairros)
            popBairros  = popBairros + pop.getPopulacao();
        
        if (popCid == popBairros)
            System.out.println("As populações coincidem. Cidade: " + popCid + ", Bairros: " + popBairros);
        else
            System.out.println("As populações não coincidem. Cidade: " + popCid + ", Bairros: " + popBairros);
    }

}
