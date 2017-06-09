/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.AluguelCarro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Caminhao> arrayCaminhoes = new ArrayList<>();
        ArrayList<CarroSport> arrayCarroSports = new ArrayList<>();
        ArrayList<CarroPasseio> arrayCarroPasseio = new ArrayList<>();
        ArrayList<ContratoAluguel> arrayContratos = new ArrayList<>();
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        ArrayList<VeiculoAlugado> arrayVeiculos = new ArrayList<>();
        ArrayList<VeiculoAlugado> arrayVeiculos2 = new ArrayList<>();
        ArrayList<VeiculoAlugado> arrayVeiculos3 = new ArrayList<>();
        ArrayList<Companhia> arrayCias = new ArrayList<>();

        //caminhão
        for (int i = 0; i < 2; i++) {
            //System.out.println("---Veículo " + i + 1 + " ---");
            //System.out.print("Digite a capacidade em kg: ");
            float cap = (1500 + i);
            //System.out.print("Código do caminhão: ");
            int codigo = i;
            //System.out.print("Valor do aluguel do veículo: ");
            int valor = (100 + i);

            Caminhao caminhao = new Caminhao(cap, codigo, valor);

            arrayCaminhoes.add(caminhao);
        }

        //carro sport
        for (int i = 0; i < 2; i++) {
            //System.out.println("---Veículo " + (i + 1) + " ---");
            //System.out.print("Digite a velocidade máxima: ");
            float vel = (300 + i);
            //System.out.print("Código do carro sport: ");
            int codigo = i;
            //System.out.print("Valor do aluguel do veículo: ");
            int valor = (200 + i);

            CarroSport carroSport = new CarroSport(vel, codigo, valor);
            arrayCarroSports.add(carroSport);
        }

        //carro de passeio        
        for (int i = 0; i < 2; i++) {
            //System.out.println("---Veículo " + (i + 1) + " ---");
            //System.out.print("Digite a capacidade de pessoas: ");
            int capP = (5 + i);
            //System.out.print("Código do carro de passeio: ");
            int codigo = (i * 2);
            //System.out.print("Valor do aluguel do veículo: ");
            int valor = (300 + i);

            CarroPasseio carroPasseio = new CarroPasseio(capP, codigo, valor);
            arrayCarroPasseio.add(carroPasseio);

        }

        //cliente
        for (int i = 0; i < 3; i++) {
            //System.out.println("---Cliente " + (i + 1) + " ---");
            //System.out.println("Digite o nome: ");
            String nome = "Cliente" + i;
            //System.out.println("Digite o CPF: ");
            String cpf = "CPF" + i;

            Cliente cliente = new Cliente(nome, cpf);
            arrayClientes.add(cliente);

        }

        //contrato 1     
        //System.out.println("---Contrato 1");
        //System.out.println("Data: ");
        String data = "10/01/2001";

        arrayVeiculos.add(arrayCarroSports.get(0));
        arrayVeiculos.add(arrayCarroPasseio.get(1));

        arrayContratos.add(new ContratoAluguel(data, arrayClientes.get(0), arrayVeiculos));           
        //arrayVeiculos.clear(); --> passagem de parâmetro de objeto e array é por referência, se utilizar vai alterar o valor da posição de 
        //memória e consequentemente o conteúdo do objeto        
        //- se passar tipos primitivos (int, float, double etc), eles não serão alterados pelo métodos (a passagem é por cópia)
        //- se passar arrays, eles serão alterados pelos métodos. Bem como todo tipo de Classes
        //--arrayVeiculos.clear(); vai zerar o array de cima e impactar diretamente no objeto ContratoAluguel, 
        //mesmo já tendo utilizado o valor, pois é referência
        //--arrayClientes.get(0).setNome("TESteeeee"); vai alterar o nome já utilizado acima
        
        //contrato 2
        //System.out.println("---Contrato 2");
        //System.out.print("Data: ");
        data = "20/02/2002";

        arrayVeiculos2.add(arrayCaminhoes.get(0));
        arrayVeiculos2.add(arrayCaminhoes.get(1));
        
        arrayContratos.add(new ContratoAluguel(data, arrayClientes.get(1), arrayVeiculos2));
       
        
        //contrato 3
        //System.out.println("---Contrato 3");
        //System.out.print("Data: ");
        data = "30/03/2003";

        arrayVeiculos3.add(arrayCarroSports.get(1));
        arrayVeiculos3.add(arrayCarroPasseio.get(0));

        arrayContratos.add(new ContratoAluguel(data, arrayClientes.get(2), arrayVeiculos3));
        

        //companhia de aluguel - 1
        //System.out.print("Digite o nome da 1a CIA: ");
        String nomeCia = "CIA 1";
        //System.out.print("CNPJ: ");
        String cnpjCia = "CNPJ 1";

        ArrayList<ContratoAluguel> arrayContratos2 = new ArrayList<>();
        arrayContratos2.add(arrayContratos.get(0));

        Companhia cia1 = new Companhia(nomeCia, cnpjCia, arrayContratos2);

        //companhia de aluguel - 2
        //System.out.print("Digite o nome da 2a CIA: ");
        nomeCia = "CIA 2";
        //System.out.print("CNPJ: ");
        cnpjCia = "CNPJ 2";

        ArrayList<ContratoAluguel> arrayContratos3 = new ArrayList<>();

        arrayContratos3.add(arrayContratos.get(1));
        arrayContratos3.add(arrayContratos.get(2));

        Companhia cia2 = new Companhia(nomeCia, cnpjCia, arrayContratos3);

        //arrayCias
        arrayCias.add(cia1);
        arrayCias.add(cia2);

        for (Companhia cia : arrayCias) { //percorrendo array de Companhias
            System.out.println("--Companhia--");
            System.out.println(cia.getNome());
            System.out.println(cia.getCnpj());

            for (ContratoAluguel contratoAlug : cia.getContratos_aluguel()) { //cada companhia pode ter vários contratos
                System.out.println("\t--Contratos dessa empresa--");
                System.out.println("\t" + contratoAlug.getCliente().getNome());
                System.out.println("\t" + contratoAlug.getData() + "\n");

                for (VeiculoAlugado veicAlug : contratoAlug.getVeiculo_alugado()) { //cada contrato pode ter vários veículos
                    System.out.println("\t\t--Carros deste Contrato--");
                    System.out.println("\t\tDados do veic: " + veicAlug.imprimir_dados() + "\n");
                    //System.out.println(veicAlug.get);
                }
            }
        }

    }

}
