/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10OverLoadOverride;

import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Overload
        TV tv = new TV();

        //tv ligada, canal 8 e volume 10;
        tv.ligar(true);
        tv.ligar(8, 10);

        //Override
        Pessoa pessoa = new Pessoa();
        Cliente cliente = new Cliente();

        pessoa.setNome("IFMS - Não cliente");
        pessoa.setDesconto(100);

        cliente.setNome("IFMS - cliente");
        cliente.setId(1);
        cliente.setDesconto(100);

        System.out.println("Desconto do cliente: " + cliente.getDesconto()
                + ". \nDesconto da pessoa: " + pessoa.getDesconto());

    }

}
