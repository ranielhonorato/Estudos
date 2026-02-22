import entities.Pessoa;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int totalPessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoa = new Pessoa[totalPessoas];
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            pessoa[i] = new Pessoa(nome, idade);
        }

        int maisVelho = pessoa[0].getIdade();
        String nomeMaisVelho = pessoa[0].getNome();
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() >= maisVelho) {
                maisVelho = pessoa[i].getIdade();
                nomeMaisVelho = pessoa[i].getNome();

            }
        }

        System.out.print("Pessoa mais velha: " + nomeMaisVelho);

        sc.close();
    }
}