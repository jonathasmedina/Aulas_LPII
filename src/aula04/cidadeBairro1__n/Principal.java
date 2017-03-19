/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.cidadeBairro1__n;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 * exercício cidade bairros cadastro de cidades e de bairros e posterior vinculação
 */
public class Principal {
    
    public static void main (String[] args){
       int op, i=0, cid;
        
        Scanner e = new Scanner(System.in);
        Scanner e2 = new Scanner(System.in);
        
        ArrayList<Cidade> listaCidades = new ArrayList<>(); 
        ArrayList<Bairro> listaBairros = new ArrayList<>();

        
        System.out.println("Digite a opção: ");
        do{
            System.out.println("1 - Cadastrar Cidade");
            System.out.println("2 - Cadastrar bairro");
            System.out.println("3 - Listar cidades cadastradas ");            
            System.out.println("4 - Listar bairros cadastradas ");            
            System.out.println("5 - Vincular bairros cadastrados a uma cidade");
            System.out.println("6 - Sair");
            op = e2.nextInt();
            
            switch(op){
                case 1:
                    Cidade cidade = new Cidade();
                    
                    System.out.println("Insira o nome da cidade: ");
                    cidade.setNome(e.nextLine());
                    
                    System.out.println("População: ");
                    cidade.setPopulacao(e2.nextInt());
                    listaCidades.add(cidade);
                    
                    break;
                case 2:
                    Bairro bairro = new Bairro();
                    
                    System.out.println("Insira o nome do bairro: ");
                    bairro.setNome(e.nextLine());
                    listaBairros.add(bairro);
                    break;
                case 3:
                    for (Cidade cidades : listaCidades)
                        System.out.println(cidades.getNome());
                    break;
                case 4:
                    for (Bairro bairros : listaBairros)
                        System.out.println(bairros.getNome());
                    break;
                case 5:
                    System.out.println("Vincular bairros a qual cidade?");
                    for (Cidade cidades : listaCidades)
                    {
                        System.out.println(i+" - " + cidades.getNome());
                        i++;
                    }
                    cid = e2.nextInt();
                    listaCidades.get(cid).setBairro(listaBairros);
                    
                    System.out.println("Lista de bairros vinculados à cidade " + listaCidades.get(cid).getNome());
                    System.out.println("---Cidade: " +listaCidades.get(cid).getNome() + "---");
                    System.out.println("Bairros: " + listaCidades.get(cid).getBairro().toString());
                    
                    break;
                case 6:
                    break;
                default: 
                    System.out.println("Opção inválida");
            }
                
       }while (op != 6);
            
    }
        
    
    
}
