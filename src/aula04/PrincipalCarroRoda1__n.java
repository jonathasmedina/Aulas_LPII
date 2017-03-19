/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class PrincipalCarroRoda1__n {
    
        public static void main (String[] args){
            Scanner e = new Scanner(System.in);
         
            
            Carro carro = new Carro();
            ArrayList<Roda> listaRodas = new ArrayList<>(); 
            // ou LinkedList<Roda> listaRodas = new LinkedList<>(); linked: mais rápido, mas consome mais memória
                        
            //carro
            System.out.println("----CADASTRANDO UM CARRO----");
            System.out.println("Insira a marca do carro: ");
            carro.setMarca(e.next());
            
            System.out.println("Insira o ano do carro: ");
            carro.setAno(e.nextInt());
            
            //rodas
            System.out.println("----CADASTRANDO 4 RODAS----");
            for (int i = 0; i < 4; i++){
                Roda roda = new Roda();
                System.out.println("Digite o aro da " +(i+1)+"a roda: ");
                roda.setAro(e.nextInt());
                
                System.out.println("Digite a marca da " +(i+1)+"a roda: ");
                roda.setMarca(e.next());
                
                System.out.println("Digite a quilometragem da " +(i+1)+"a roda: ");
                roda.setKmRodados(e.nextInt());
                
                listaRodas.add(roda);                
            }
            //setando as quatro rodas no atributo do carro
            carro.setRoda(listaRodas);
            
            System.out.println("O carro " +carro.getMarca()+ ", ano: " +carro.getAno()+
                    " possui as seguintes rodas: " +carro.getRoda().toString());
        }
}
