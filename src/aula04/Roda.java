/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Jonathas
 */
public class Roda {
    private int aro;
    private int kmRodados;
    private String marca;

    public int getAro() {
        return aro;
    }
    public void setAro(int aro) {
        this.aro = aro;
    }
   public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getKmRodados() {
        return kmRodados;
    }
    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    @Override
    public String toString() {
        return "\naro: " + aro + ", kmRodados: " + kmRodados + ", marca: " + marca;
    }
}
