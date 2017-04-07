/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.Herança;

/**
 *
 * @author Jonathas
 */
public class SubClasse extends SuperClasse {

    int numSub;

    public SubClasse(int numSub) {
        super(numSub);      //<--
        this.numSub = numSub;
    }
}
