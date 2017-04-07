/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        System.out.println("Digite o nome do aluno 1: ");
        a1.setNome(e.next());

        System.out.println("Digite o nome do aluno 2: ");
        a2.setNome(e.next());

        System.out.println("Digite o nome do aluno 3: ");
        a3.setNome(e.next());

        //turmas
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        Turma t3 = new Turma();

        System.out.println("Digite o código da turma 1: ");
        t1.setCodigo(e.nextInt());

        System.out.println("Digite a descrição da turma 1: ");
        t1.setDescricao(e.next());

        System.out.println("Digite o  código da turma 2: ");
        t2.setCodigo(e.nextInt());

        System.out.println("Digite a descrição da turma 2: ");
        t2.setDescricao(e.next());

        System.out.println("Digite o código da turma 3: ");
        t3.setCodigo(e.nextInt());

        System.out.println("Digite a descrição da turma 3: ");
        t3.setDescricao(e.next());

        //cursos
        Curso c1 = new Curso();
        Curso c2 = new Curso();
        Curso c3 = new Curso();

        System.out.println("Digite o nome do curso 1: ");
        c1.setNome(e.next());

        System.out.println("Digite código do curso 1: ");
        c1.setCodCurso(e.nextInt());

        System.out.println("digite a carga horária do curso 1: ");
        c1.setCargaHoraria(e.nextInt());

        System.out.println("Digite o nome do curso 2: ");
        c2.setNome(e.next());

        System.out.println("Digite código do curso 2: ");
        c2.setCodCurso(e.nextInt());

        System.out.println("digite a carga horária do curso 2: ");
        c2.setCargaHoraria(e.nextInt());

        System.out.println("Digite o nome do curso 3: ");
        c3.setNome(e.next());

        System.out.println("Digite código do curso 3: ");
        c3.setCodCurso(e.nextInt());

        System.out.println("digite a carga horária do curso 3: ");
        c3.setCargaHoraria(e.nextInt());

        //vinculando alunos em uma turma:
        //turma 1: alunos 1 e 2
        ArrayList<Aluno> alunosT1 = new ArrayList<>();
        alunosT1.add(a1);
        alunosT1.add(a2);
        t1.setAlunos(alunosT1);

        //turma 2: aluno 3
        ArrayList<Aluno> alunosT2 = new ArrayList<>();
        alunosT2.add(a3);
        t2.setAlunos(alunosT2);
        
        //turma 3: alunos 1 e 3
        ArrayList<Aluno> alunosT3 = new ArrayList<>();
        alunosT3.add(a1);
        alunosT3.add(a3);
        t3.setAlunos(alunosT3);
        
        //vinculando turmas a um curso:
        //Turma 1 e 2 pertencem ao curso 1;
        ArrayList<Turma> turmasC1 = new ArrayList<>();
        turmasC1.add(t1);
        turmasC1.add(t2);

        c1.setTurmas(turmasC1);

        //Turma 3 pertence ao curso 2:
        ArrayList<Turma> turmasC2 = new ArrayList<>();
        turmasC2.add(t3);
        c2.setTurmas(turmasC2);

        System.out.println("--RELATÓRIO--");
        System.out.println("CURSO 1");
        System.out.println(c1.getNome());
        System.out.println(c1.getCodCurso());
        System.out.println(c1.getCargaHoraria());
        System.out.println("Turmas do curso 1:");
        
        //Turmas 1 e 3 pertencem ao curso 3
        ArrayList<Turma> turmasC3 = new ArrayList<>();
        turmasC3.add(t1);
        turmasC3.add(t3);
        c3.setTurmas(turmasC3);

        //percorrendo um vetor
        for (Turma turma : c1.getTurmas()) {
            System.out.println(turma.getDescricao());
        }
        
        System.out.println("--RELATÓRIO--");
        System.out.println("CURSO 2");
        System.out.println(c2.getNome());
        System.out.println(c2.getCodCurso());
        System.out.println(c2.getCargaHoraria());
        System.out.println("Turmas do curso 2:");

        //percorrendo um vetor
        for (Turma turma : c2.getTurmas()) {
            System.out.println(turma.getDescricao());
        }
        
        System.out.println("--RELATÓRIO--");
        System.out.println("CURSO 3");
        System.out.println(c3.getNome());
        System.out.println(c3.getCodCurso());
        System.out.println(c3.getCargaHoraria());
        System.out.println("Turmas do curso 3:");

        //percorrendo um vetor
        for (Turma turma : c3.getTurmas()) {
            System.out.println(turma.getDescricao());
        }
        
        //exibindo as turmas e os alunos
         System.out.println("--RELATÓRIO--");
        System.out.println("TURMA 1");
        System.out.println(t1.getCodigo());
        System.out.println(t1.getDescricao());        
        System.out.println("Alunos da turma 1:");
        
        for (Aluno aluno : t1.getAlunos()) {
            System.out.println(aluno.getNome());
        }
        
          System.out.println("--RELATÓRIO--");
        System.out.println("TURMA 2");
        System.out.println(t2.getCodigo());
        System.out.println(t2.getDescricao());        
        System.out.println("Alunos da turma 2:");
        
        for (Aluno aluno : t2.getAlunos()) {
            System.out.println(aluno.getNome());
        }
        
          System.out.println("--RELATÓRIO--");
        System.out.println("TURMA 3");
        System.out.println(t3.getCodigo());
        System.out.println(t3.getDescricao());        
        System.out.println("Alunos da turma 3:");
        
        for (Aluno aluno : t3.getAlunos()) {
            System.out.println(aluno.getNome());
        }

    }
}
