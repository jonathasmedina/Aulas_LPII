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
public class ClasseAbstract_Sub extends ClasseAbstract_Super{
    String nome = "IFMS";
    
    @Override   //--sobrescrita do método da superclasse abstract com comportamento
    public String nome() {
        return nome;
    };
    
}
