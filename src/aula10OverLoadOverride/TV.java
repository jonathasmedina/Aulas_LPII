/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10OverLoadOverride;

/**
 *
 * @author Jonathas
 */
public class TV {
   
    int canal;
    int volume;
    boolean ligada;
    int tamanho;

    void ligar() {
        this.ligar(3, 25, true);
    }
    
    int ligar(){
        return 10;
    }



    void ligar(boolean ligada) {
        this.ligar(3, 25, ligada);
    }

    void ligar(int canal, int volume) {
        this.ligar(canal, volume, true);
    }

    void ligar(int canal, int volume, boolean ligada) {
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
    }
}

