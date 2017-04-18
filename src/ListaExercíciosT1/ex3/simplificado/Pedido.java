/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex3.simplificado;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Jonathas
 */
public class Pedido implements Serializable{

    private int numPedido;
    private String data;
    private Consumidor consumidor;
    private ArrayList<Software> softwares;
    private ArrayList<Hardware> hardwares;
    private Produto produto;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ArrayList<Software> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(ArrayList<Software> softwares) {
        this.softwares = softwares;
    }

    public ArrayList<Hardware> getHardwares() {
        return hardwares;
    }

    public void setHardwares(ArrayList<Hardware> hardwares) {
        this.hardwares = hardwares;
    }

}
