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
public class CarroPasseio extends VeiculoAlugado {

    private int capacidade_pessoas;

    public CarroPasseio(int capacidade_pessoas, int codigo, int valor) {
        super(codigo, valor);
        this.capacidade_pessoas = capacidade_pessoas;
    }

    public int getCapacidade_pessoas() {
        return capacidade_pessoas;
    }

    public void setCapacidade_pessoas(int capacidade_pessoas) {
        this.capacidade_pessoas = capacidade_pessoas;
    }

    @Override
    public String imprimir_dados() {
        return "Capacidade de pessoas: " + this.capacidade_pessoas + ". Código: " + this.getCodigo() + ". Valor: " + this.getValor();
    }

}
