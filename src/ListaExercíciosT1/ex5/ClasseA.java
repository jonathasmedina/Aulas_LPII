/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex5;

/**
 *
 * @author Jonathas
 */
public class ClasseA {
    private int a;

    ClasseA(int a){
        this.a = a;
    }
    
    void incrementa(int a){
        a = a+1;
    }
    
    void imprime(){
        System.out.print(a);
    }
    
}
