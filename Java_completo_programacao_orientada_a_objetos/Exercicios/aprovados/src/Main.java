import entities.Aluno;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int totalAlunos = sc.nextInt();
        sc.nextLine();

        Aluno[] aluno = new Aluno[totalAlunos];
        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            String nome = sc.nextLine();
            double primeiraNota = sc.nextDouble();
            double segundaNota = sc.nextDouble();
            sc.nextLine();
            aluno[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        double[] somaNotas = new double[totalAlunos];

        for (int i = 0; i < aluno.length; i++) {
            somaNotas[i] = aluno[i].getPrimeiroSemestre() + aluno[i].getSegundoSemestre();
        }

        double[] media = new double[totalAlunos];
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < aluno.length; i++) {
            media[i] = somaNotas[i] / 2.0;
            if (media[i] >= 6){
                System.out.println(aluno[i].getNome());
            }
        }

    }
}