/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex4;

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
        int i = 0;

        //agencias
        ArrayList<Agencia> agencias = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            Agencia ag = new Agencia();

            System.out.println("---Agências---");
            System.out.print("Digite o código da agência " + (i + 1) + ": ");
            ag.setCodAgencia(e.nextInt());
            System.out.print("Digite o nome da agência " + (i + 1) + ": ");
            ag.setNomeAgencia(e2.nextLine());

            agencias.add(ag);
            System.out.println("");
        }

        //gerentes
        ArrayList<Gerente> gerentes = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            Gerente gt = new Gerente();

            System.out.println("---Gerentes---");
            System.out.print("Digite o código funcional do gerente " + (i + 1) + ": ");
            gt.setCodFuncional(e.nextInt());

            System.out.print("Digite o nome do gerente " + (i + 1) + ": ");
            gt.setNome(e2.nextLine());
            System.out.print("Digite a idade do gerente " + (i + 1) + ": ");
            gt.setIdade(e.nextInt());
            System.out.print("Digite o endereço do gerente " + (i + 1) + ": ");
            gt.setEndereco(e2.nextLine());
            System.out.println("");

            gerentes.add(gt);

        }

        //contas-correntes
        ArrayList<ContaCorrente> contasCorrentes = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            ContaCorrente cc = new ContaCorrente();

            System.out.println("---Contas-Correntes---");

            System.out.print("Digite o número da conta corrente " + (i + 1) + ": ");
            cc.setNumero(e.nextInt());

            System.out.print("Digite a data de abertura da conta corrente " + (i + 1) + ": ");
            cc.setDataAbertura(e2.nextLine());

            System.out.print("Digite o limite do cheque especial da conta corrente " + (i + 1) + ": ");
            cc.setLimiteChequeEspecial(e.nextInt());

            contasCorrentes.add(cc);

            System.out.println("");
        }

        //contas-poupanças
        ArrayList<ContaPoupanca> contasPoupancas = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            ContaPoupanca cp = new ContaPoupanca();

            System.out.println("---Contas-Poupanças---");

            System.out.print("Digite o número da conta poupanças " + (i + 1) + ": ");
            cp.setNumero(e.nextInt());

            System.out.print("Digite a data de abertura da conta poupanças " + (i + 1) + ": ");
            cp.setDataAbertura(e2.nextLine());

            System.out.print("Digite o dígito verificador da conta poupanças " + (i + 1) + ": ");
            cp.setDigitoVerif(e.nextInt());

            contasPoupancas.add(cp);

            System.out.println("");
        }

        //pessoas físicas
        ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            PessoaFisica pf = new PessoaFisica();

            System.out.println("---Pessoas Físicas---");

            System.out.print("Digite o nome da pessoa física " + (i + 1) + ": ");
            pf.setNome(e2.nextLine());
            System.out.print("Digite a idade da pessoa física " + (i + 1) + ": ");
            pf.setIdade(e.nextInt());
            System.out.print("Digite o endereço da pessoa física " + (i + 1) + ": ");
            pf.setEndereco(e2.nextLine());
            System.out.print("Digite o cpf da pessoa física " + (i + 1) + ": ");
            pf.setCpf(e2.nextLine());

            pessoasFisicas.add(pf);
            System.out.println("");
        }

        //pessoas jurídicas
        ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            PessoaJuridica pj = new PessoaJuridica();

            System.out.println("---Pessoas Jurídicas---");

            System.out.print("Digite o nome da pessoa jurídica " + (i + 1) + ": ");
            pj.setNome(e2.nextLine());
            System.out.print("Digite a idade da pessoa jurídica " + (i + 1) + ": ");
            pj.setIdade(e.nextInt());
            System.out.print("Digite o endereço da pessoa jurídica " + (i + 1) + ": ");
            pj.setEndereco(e2.nextLine());
            System.out.print("Digite o cnpj da pessoa jurídica " + (i + 1) + ": ");
            pj.setCnpj(e2.nextLine());

            pessoasJuridicas.add(pj);
            System.out.println("");
        }

        //a
        agencias.get(0).setArrayContaCorrente(contasCorrentes);
        agencias.get(1).setArrayContaPoupanca(contasPoupancas);

        //b
        ArrayList<Gerente> gerentes0 = new ArrayList<>();
        gerentes0.add(gerentes.get(0));
        agencias.get(0).setArrayGerente(gerentes0);
        ArrayList<Gerente> gerentes1 = new ArrayList<>();
        gerentes1.add(gerentes.get(1));
        agencias.get(1).setArrayGerente(gerentes1);

        //c
        contasCorrentes.get(0).setTitular(pessoasJuridicas.get(0));
        contasCorrentes.get(1).setTitular(pessoasJuridicas.get(1));
        contasPoupancas.get(0).setTitular(pessoasFisicas.get(0));
        contasPoupancas.get(1).setTitular(pessoasFisicas.get(1));

        //agências
        for (i = 0; i < 2; i++) {
            System.out.println("---AGÊNCIA: " + (i + 1));

            System.out.println("Código da agência: " + agencias.get(i).getCodAgencia());
            System.out.println("Nome da agência: " + agencias.get(i).getNomeAgencia());
            System.out.println("Gerente da agência: " + agencias.get(i).getArrayGerente().get(0).getNome());

            System.out.println("--Contas da Agência " + (i + 1));
            if (agencias.get(i).getArrayContaCorrente() != null) {
                for (ContaCorrente contac : contasCorrentes) {
                    System.out.println("Número da conta: " + contac.getNumero());
                    System.out.println("Data de abertura da conta: " + contac.getDataAbertura());
                    System.out.println("Titular da conta: " + contac.getTitular().getNome());
                    System.out.println("Limite do cheque especial: " + contac.getLimiteChequeEspecial());
                    System.out.println("");
                }
            }
            if (agencias.get(i).getArrayContaPoupanca() != null) {
                for (ContaPoupanca contap : contasPoupancas) {
                    System.out.println("Número da conta: " + contap.getNumero());
                    System.out.println("Data de abertura da conta: " + contap.getDataAbertura());
                    System.out.println("Titular da conta: " + contap.getTitular().getNome());
                    System.out.println("Limite do cheque especial: " + contap.getDigitoVerif());
                    System.out.println("");
                }
            }

        }

    }

}
