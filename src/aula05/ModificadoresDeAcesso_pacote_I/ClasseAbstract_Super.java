/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.ModificadoresDeAcesso_pacote_I;

/**
 *
 * @author Jonathas
 */
public abstract class ClasseAbstract_Super {
    String teste;
    //método "oco", sem comportamento;
    public abstract String nome();
    
    public abstract String nome2();
    
    public String nome3(){
        return teste="";
    };
    
    
        
}
