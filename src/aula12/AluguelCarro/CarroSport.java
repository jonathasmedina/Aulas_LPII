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
public class CarroSport extends VeiculoAlugado{
    private float vel_maxima;

    public CarroSport(float vel_maxima, int codigo, int valor) {
        super(codigo, valor);
        this.vel_maxima = vel_maxima;
    }
    
    public float getVel_maxima() {
        return vel_maxima;
    }

    public void setVel_maxima(float vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    @Override
    public String imprimir_dados() {
        return "Velocidade Máxima: " + this.vel_maxima + ". Código: " + this.getCodigo() + ". Valor: " + this.getValor();
    }
    
    
}
