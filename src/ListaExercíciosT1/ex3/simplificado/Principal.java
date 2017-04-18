/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex3.simplificado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Scanner e2 = new Scanner(System.in);
        int i;

        //4 produtos..
        ArrayList<Hardware> hardwares = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            Hardware hw = new Hardware();
            System.out.print("Digite o id do hardware " + (i + 1) + ": ");
            hw.setIdProduto(e.nextInt());

            System.out.print("Digite a descrição do hardware " + (i + 1) + ": ");
            hw.setDescricaoProduto(e2.nextLine());

            System.out.print("Digite o preço por unidade do hardware " + (i + 1) + ": ");
            hw.setPrecoUnidade(e.nextInt());

            System.out.print("Digite a descrição das peças " + (i + 1) + ": ");
            hw.setDescricaoPecas(e2.nextLine());

            hardwares.add(hw);

            System.out.println("");
        }

        ArrayList<Software> softwares = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            System.out.println("----");
            Software sw = new Software();
            System.out.print("Digite o id do software " + (i + 1) + ": ");
            sw.setIdProduto(e.nextInt());

            System.out.print("Digite a descrição do software " + (i + 1) + ": ");
            sw.setDescricaoProduto(e2.nextLine());

            System.out.print("Digite o preço por unidade do software " + (i + 1) + ": ");
            sw.setPrecoUnidade(e.nextInt());

            System.out.print("Digite o num da versão " + (i + 1) + ": ");
            sw.setNumVersao(e.nextInt());

            softwares.add(sw);

            System.out.println("");
        }

        ArrayList<Consumidor> consumidores = new ArrayList<>();
        for (i = 0; i < 3; i++) {
            System.out.println("----");
            Consumidor c = new Consumidor();
            System.out.print("Digite o id do consumidor " + (i + 1) + ": ");
            c.setIdConsumidor(e.nextInt());

            System.out.print("Digite o nome do consumidor " + (i + 1) + ": ");
            c.setNome(e.next());

            System.out.print("Digite o endereço do consumidor " + (i + 1) + ": ");
            c.setEndereco(e2.nextLine());

            consumidores.add(c);

            System.out.println("");
        }

        ArrayList<Pedido> pedidos = new ArrayList<>();
        for (i = 0; i < 3; i++) {
            System.out.println("----");
            Pedido p = new Pedido();
            System.out.print("Insira o número do pedido " + (i + 1) + ": ");
            p.setNumPedido(e.nextInt());

            System.out.print("Insira a data do pedido " + (i + 1) + ": ");
            p.setData(e.next());

            pedidos.add(p);

            System.out.println("");
        }

        //primeiro pedido
        pedidos.get(0).setConsumidor(consumidores.get(0));
        pedidos.get(0).setSoftwares(softwares);

        //segundo pedido
        pedidos.get(1).setConsumidor(consumidores.get(1));
        pedidos.get(1).setSoftwares(softwares);
        pedidos.get(1).setHardwares(hardwares);

        //terceiro pedido
        pedidos.get(2).setConsumidor(consumidores.get(2));
        pedidos.get(2).setHardwares(hardwares);

        for (i = 0; i < 3; i++) {
            System.out.println("---Relatório do Pedido " + (i + 1) + "---");
            System.out.println("Num pedido: " + pedidos.get(i).getNumPedido());
            System.out.println("Data do pedido: " + pedidos.get(i).getData());

            System.out.println("--Dados do Consumidor--");
            System.out.println("Id consumidor: " + pedidos.get(i).getConsumidor().getIdConsumidor());
            System.out.println("Nome consumidor: " + pedidos.get(i).getConsumidor().getNome());
            System.out.println("Endereço consumidor: " + pedidos.get(i).getConsumidor().getEndereco());

            System.out.println("--Dados dos produtos do pedido--");

            if (pedidos.get(i).getSoftwares() != null) {
                for (Software software : pedidos.get(i).getSoftwares()) {
                    System.out.println("Id produto: " + software.getIdProduto());
                    System.out.println("Descrição produto: " + software.getDescricaoProduto());                   
                }
            }

            if (pedidos.get(i).getHardwares() != null) {
                for (Hardware hardware : pedidos.get(i).getHardwares()) {
                    System.out.println("Id produto: " + hardware.getIdProduto());
                    System.out.println("Descrição produto: " + hardware.getDescricaoProduto());
                    System.out.println("Preço produto: " + hardware.getPrecoUnidade());
                    System.out.println("Descrição peças: " + hardware.getDescricaoPecas());
                    System.out.println("");
                }
            }


            /*    for (int j = 0; j < pedidos.get(i).getSoftwares().size(); j++) {
                System.out.println("Id produto: " + pedidos.get(i).getSoftwares().get(j).getIdProduto());
                System.out.println("Descrição produto: " + pedidos.get(i).getSoftwares().get(j).getDescricaoProduto());
                System.out.println("Preço produto: " + pedidos.get(i).getSoftwares().get(j).getPrecoUnidade());
                System.out.println("Versão produto: " + pedidos.get(i).getSoftwares().get(j).getNumVersao());
            }
            for (int j = 0; j < pedidos.get(i).getHardwares().size(); j++) {
                System.out.println("Id produto: " + pedidos.get(i).getHardwares().get(j).getIdProduto());
                System.out.println("Descrição produto: " + pedidos.get(i).getHardwares().get(j).getDescricaoProduto());
                System.out.println("Preço produto: " + pedidos.get(i).getHardwares().get(j).getPrecoUnidade());
                System.out.println("Descrição peças: " + pedidos.get(i).getHardwares().get(j).getDescricaoPecas());
            }*/
            System.out.println("");
        }
    }

}
