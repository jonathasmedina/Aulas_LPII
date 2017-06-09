/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.AluguelCarro;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class ContratoAluguel {

    private String data;
    private Cliente cliente;
    private ArrayList<VeiculoAlugado> veiculo_alugado;

    public ContratoAluguel(String data, Cliente cliente, ArrayList<VeiculoAlugado> veiculo_alugado) {
        this.data = data;
        this.cliente = cliente;
        this.veiculo_alugado = veiculo_alugado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<VeiculoAlugado> getVeiculo_alugado() {
        return veiculo_alugado;
    }

    public void setVeiculo_alugado(ArrayList<VeiculoAlugado> veiculo_alugado) {
        this.veiculo_alugado = veiculo_alugado;
    }

}
