/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Jonathas
 */
public class Classe2_media {
    
    String nome;
    int idade, turma, cod;
    float res;
    
    //ex 2
    public float calcular_exibir(float n1, float n2, float n3){
   //public void calcular_exibir(float n1, float n2, float n3){
        res = (n1+n2+n3)/3;
        System.out.println("Média: " + res);                
        //ex 2:
        return res;
    }
    
    public void verAp (float media){
        if (media >= 7.0){
            System.out.println("O aluno "+ nome+ " está APROVADO");
        }else
            System.out.println("O aluno "+ nome+ " está REPROVADO");
    }
    
}
