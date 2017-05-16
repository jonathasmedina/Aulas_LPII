/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08_ArrayListMetodos;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static Pessoa p1, p2, p3, p4, p5, pn;

    public static void main(String[] args) {

        p1 = new Pessoa();
        p2 = new Pessoa();
        p3 = new Pessoa();
        p4 = new Pessoa();
        p5 = new Pessoa();
        pn = new Pessoa();

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        p1.setIdade(10);
        p1.setNome("IFMS - p1");
        p2.setIdade(20);
        p2.setNome("IFMS - p2");
        p3.setIdade(30);
        p3.setNome("IFMS - p3");
        p4.setIdade(40);
        p4.setNome("IFMS - p4");
        p5.setIdade(50);
        p5.setNome("IFMS - p5");

        pessoas = limpaEadd(pessoas);

        //boolean add(Object object)
        if (pessoas.add(p1)) {
            System.out.println("Pessoa inserida no ArrayList.");
        } else {
            System.out.println("Pessoa não inserida.");
        }

        //void add(int index, Object element)
        pessoas.add(0, p1);

        pessoas = limpaEadd(pessoas);
         for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Posição " + i + " contém o elemento: " + pessoas.get(i).getNome()
            );
        }
         System.out.println("---Tamanho da lista: "+ pessoas.size());
                 
        pessoas.add(2, p4);
        
        System.out.println("---Adicionado um elemento na posição 2 (elemento p4)---");
        System.out.println("---Tamanho da lista: "+ pessoas.size());
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Posição " + i + " contém o elemento: " + pessoas.get(i).getNome()
            );
        }

        //2. void clear();
        pessoas.clear();
        System.out.println("Tamanho da lista: " + pessoas.size() + ", dados: " + pessoas.toString());

        //3. boolean contains(Object element)
        if (pessoas.contains(p1)) {
            System.out.println("A lista contém p1.");
        } else if (pessoas.contains(p2)) {
            System.out.println("A lista contém p2.");
        } else {
            System.out.println("A lista não contém p1 ou p2");
        }

        pessoas.add(p1);
        System.out.println(pessoas.get(0).getNome());

        pessoas = limpaEadd(pessoas);

        //int i = pessoas.indexOf(p1);
        int i = pessoas.lastIndexOf(p5);
        if (i != -1) {
            System.out.println("O elemento está na lista, posição: " + i);
        } else {
            System.out.println("O elemento não está na lista.");
        }

        //6. boolean isEmpty()
        //pessoas.clear();
        if (pessoas.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia");
        }

        
        pessoas = limpaEadd(pessoas);
        System.out.println("Tamanho da lista antes da remoção:" + pessoas.size());
        pessoas.remove(p2);
        System.out.println("Tamanho da lista da da remoção:" + pessoas.size());

        if (pessoas.remove(p5)) {
            System.out.println("P5 removida");
        } else {
            System.out.println("P5 não está na lista!");
        }

        pessoas = limpaEadd(pessoas);

        for (i = 0; i < pessoas.size(); i++) {
            System.out.println("Posição " + i + " contém o elemento: " + pessoas.get(i).getNome()
            );
        }

        pessoas.remove(0);
        System.out.println("");

        for (i = 0; i < pessoas.size(); i++) {
            System.out.println("Posição " + i + " contém o elemento: " + pessoas.get(i).getNome()
            );
        }

        pessoas = limpaEadd(pessoas);

        for (i = 0; i < pessoas.size(); i++) {
            System.out.println("**Posição " + i + " contém o elemento: " + pessoas.get(i).getNome()
            );
        }
        
        pessoas.remove(p2);

        System.out.println("");
        for (i = 0; i < pessoas.size(); i++) {
            System.out.println("**Posição " + i + " contém o elemento: " + pessoas.get(i).getNome()
            );
        }
        System.out.println("");

        pessoas = limpaEadd(pessoas);

        pn = pessoas.set(2, p1);
        System.out.println("Posição " + 2 + " continha o elemento: " + pn.getNome()
                + ", agora: " + pessoas.get(2).getNome());

        // System.out.println("O elemento da posição 0 foi removido");
        //p1 = pessoas.remove(3);
        //System.out.println("O elemento " +p1.getNome()+ " foi removido");
    }

    public static ArrayList<Pessoa> limpaEadd(ArrayList<Pessoa> pessoas) {
        pessoas.clear();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p2);
        pessoas.add(p2);
        pessoas.add(p2);
        return pessoas;
    }
}
