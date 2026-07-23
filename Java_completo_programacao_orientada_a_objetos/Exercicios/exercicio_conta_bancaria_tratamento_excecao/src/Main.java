import model.entities.Conta;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        try {
            System.out.println("Digite os dados da conta ");
            System.out.print("Numero da conta: ");
            int numeroConta = Integer.parseInt(sc.nextLine());
            System.out.print("Nome do usuário: ");
            String nomeUsuario = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldoInicial = Double.parseDouble(sc.nextLine());
            System.out.print("Digite o limite para saque: ");
            double saqueLimite = Double.parseDouble(sc.nextLine());

            Conta contaBancaria = new Conta(numeroConta, nomeUsuario, saldoInicial, saqueLimite);

            System.out.print("Digite o valor para saque: ");
            double valorSaque = Double.parseDouble(sc.nextLine());
            contaBancaria.saque(valorSaque);

        } catch (DomainException e) {
            System.out.print("Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.print("Erro: " + e.getMessage());
        }

        sc.close();
    }

}