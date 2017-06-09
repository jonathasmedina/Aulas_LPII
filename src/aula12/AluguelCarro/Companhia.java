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
public class Companhia {

    private String nome;
    private String cnpj;
    private ArrayList<ContratoAluguel> contratos_aluguel;

    public Companhia(String nome, String cnpj, ArrayList<ContratoAluguel> contratos_aluguel) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contratos_aluguel = contratos_aluguel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<ContratoAluguel> getContratos_aluguel() {
        return contratos_aluguel;
    }

    public void setContratos_aluguel(ArrayList<ContratoAluguel> contratos_aluguel) {
        this.contratos_aluguel = contratos_aluguel;
    }

    public String imprimir_alugueis() {
        return "Companhia{" + "nome=" + nome + ", cnpj=" + cnpj + ", contratos_aluguel=" + contratos_aluguel + '}';
    }
    
    
    
}
