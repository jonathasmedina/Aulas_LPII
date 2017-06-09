/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_2.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Empregado empregado = new Empregado();

        empregado.setNome("IFMS");
        empregado.setEndereco("Rua 13 de maio");
        empregado.setNumero(1);
        empregado.setNumero(111222333);

        //serializando...
        try {
            FileOutputStream arquivoDeSaida = new FileOutputStream("c:/arquivos/empregado.ser");
            ObjectOutputStream out = new ObjectOutputStream(arquivoDeSaida);
            out.writeObject(empregado);
            out.close();
            arquivoDeSaida.close();
            System.out.println("Dados serializados gravados em c:/arquivos/empregado.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        //desserializando..
        Empregado e = null;
        try {
            FileInputStream arquivoDeEntrada = new FileInputStream("c:/arquivos/empregado.ser");
            ObjectInputStream in = new ObjectInputStream(arquivoDeEntrada);
            e = (Empregado) in.readObject();
            in.close();
            arquivoDeEntrada.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Empregado não encontrada.");
            c.printStackTrace();
            return;
        }

        System.out.println("\nDados desserializados...");
        System.out.println("Nome: " + e.getNome());
        System.out.println("Endereço: " + e.getEndereco());
        System.out.println("SSN: " + e.getSSN());
        System.out.println("Número: " + e.getNumero());

    }

}
