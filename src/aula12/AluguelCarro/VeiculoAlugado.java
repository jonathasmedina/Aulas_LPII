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
public abstract class VeiculoAlugado {

    private int codigo;
    private int valor;

    public VeiculoAlugado() {
    }

    public VeiculoAlugado(int codigo, int valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public abstract String imprimir_dados();

}
