import entities.Pessoas;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoas[] vect = new Pessoas[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");
            System.out.print("Nome: ");
            String nomePessoa = sc.nextLine();
            System.out.print("Idade:");
            int idadePessoa = sc.nextInt();
            System.out.print("Altura: ");
            double alturaPessoa = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Pessoas(nomePessoa, idadePessoa, alturaPessoa);
        }

        System.out.println();

        double soma = 0;
        int menor16 = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                menor16++;
            }
        }

        double mediaAltura = soma / vect.length;
        System.out.println("Altura media: " + mediaAltura);

        double porcentagemMenor16 = menor16 * 100.0 / vect.length;
        System.out.printf("Pessoas menores de 16 anos: %.2f %% ", porcentagemMenor16);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getName());

            }
        }

        sc.close();
    }
}