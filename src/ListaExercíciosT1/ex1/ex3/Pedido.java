/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex1.ex3;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class Pedido {

    private int numPedido;
    private String data;
    private Consumidor consumidor;
    private ArrayList<ProdutoPedido> produtoPedido;

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

    public ArrayList<ProdutoPedido> getProdutoPedido() {
        return produtoPedido;
    }

    public void setProdutoPedido(ArrayList<ProdutoPedido> produtoPedido) {
        this.produtoPedido = produtoPedido;
    }
}
