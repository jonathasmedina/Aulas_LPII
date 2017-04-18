/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int i;

        //hardware
        Hardware hw = new Hardware();
        System.out.print("Digite o id do produto:");
        hw.setIdProduto(e.nextInt());

        System.out.print("Digite a descrição do produto: ");
        hw.setDescricaoProduto(e.next());

        System.out.print("Digite o preço por unidade do produto:");
        hw.setPrecoUnidade(e.nextInt());

        System.out.println("Digite a descrição das peças: ");
        hw.setDescricao(e.next());

        //software
        Software sw = new Software();
        System.out.print("Digite o id do produto:");
        sw.setIdProduto(e.nextInt());

        System.out.print("Digite a descrição do produto: ");
        sw.setDescricaoProduto(e.next());

        System.out.print("Digite o preço por unidade do produto:");
        sw.setPrecoUnidade(e.nextInt());

        System.out.println("Digite o número da versão: ");
        sw.setNumVersao(e.nextInt());
        
        //consumidores
        Consumidor c1 = new Consumidor();
        Consumidor c2 = new Consumidor();
        
        System.out.println("Digite o id do consumidor 1: ");
        c1.setIdConsumidor(e.nextInt());
        
        System.out.println("Digite o nome do consumidor 1: ");
        c1.setNome(e.next());
        
        System.out.println("Digite o endereço do consumidor 1: ");
        c1.setEndereco(e.next());
        
        //pedido
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();
        
        System.out.println("Insira o número do primeiro pedido: ");
        p1.setNumPedido(e.nextInt());
        
        System.out.println("Insira a data do primeiro pedido: ");
        p1.setData(e.next());        
        
        System.out.println("Insira o número do segundo pedido: ");
        p2.setNumPedido(e.nextInt());
        
        System.out.println("Insira a data do primeiro pedido: ");
        p2.setData(e.next());     
        
        ArrayList<Produto> produtoPedido = new ArrayList<>();
        produtoPedido.add(hw);
        //produtoPedido.add(produtoPedido);
        
        //p1.setProdutoPedido();
        
        
    }

}
