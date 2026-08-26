import entities.Aluno;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Aluno> set = new HashSet<Aluno>();

        boolean controladorWhile = true;
        while (controladorWhile) {

            System.out.println("============ MENU ============");
            System.out.println("1 - Cadastrar aluno no curso");
            System.out.println("2 - Sair");
            String opcaoMenu = sc.nextLine();

            switch (opcaoMenu) {
                case "1":

                    System.out.print("Deseja cadastrar alunos para qual curso? [A, B OU C] \n");
                    String opcaoCurso = sc.nextLine().toLowerCase();


                    System.out.print("Quantos alunos deseja cadastrar? \n");
                    int totalAlunos = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < totalAlunos; i++) {
                        System.out.print("Digite o código do aluno #" + (1 + i) + " para o curso " + opcaoCurso.toUpperCase() + ":\n");
                        int codigoAluno = Integer.parseInt(sc.nextLine());


                        set.add(new Aluno(codigoAluno));
                    }
                    break;

                case "2":
                    controladorWhile = false;
                    break;

            }
        }

        System.out.println("total alunos: " + set.size());

    }
}
