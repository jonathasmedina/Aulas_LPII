/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathas
 */
public class Carro {
    private int ano;
    private String marca;
    private ArrayList<Roda> roda;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Roda> getRoda() {
        return roda;
    }

    public void setRoda(ArrayList<Roda> roda) {
        this.roda = roda;
    }
}
