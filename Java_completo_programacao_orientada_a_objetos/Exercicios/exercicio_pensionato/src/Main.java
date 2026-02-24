import entities.Quarto;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        System.out.print("Quantos quartos serao alugados? ");
        int totalQuartos = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu nome, email e em seguida o numero do quarto que deseja alugar de 1 a 10: ");
        for (int i = 1; i <= totalQuartos; i++) {
            System.out.println();
            System.out.println("Quarto " + i + ":  ");
            System.out.print("Nome completo: ");
            String nomeEstudante = sc.nextLine();
            System.out.print("E-mail: ");
            String emailEstudante = sc.nextLine();
            System.out.print("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();

            quartos[numeroQuarto-1] = new Quarto(numeroQuarto, nomeEstudante, emailEstudante);
        }

        System.out.println("Quartos alugados: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i].getQuarto() + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}
