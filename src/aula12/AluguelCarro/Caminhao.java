/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.AluguelCarro;

/**
 *
 * @author Jonathas
 */
public class Caminhao extends VeiculoAlugado {

    private float capacidade;

    public Caminhao(float capacidade, int codigo, int valor) {
        super(codigo, valor);
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String imprimir_dados() {
        return "Capacidade em kg: " + this.capacidade + ". Código: " + this.getCodigo() + ". Valor: " + this.getValor();
    }

}
