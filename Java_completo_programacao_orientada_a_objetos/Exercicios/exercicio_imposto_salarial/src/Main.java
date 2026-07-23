import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> relatorio = new ArrayList<>();

        System.out.print("Quantos contribuintes deseja informar: ");
        int numeroContribuintes = sc.nextInt();

        for (int i = 0; i < numeroContribuintes; i++) {
            System.out.print("Deseja informar para pessoa física ou jurídica (F/J)? ");
            char tipoPessoa = sc.next().charAt(0);

            if (tipoPessoa == 'f' || tipoPessoa == 'F') {
                System.out.print("Digite o seu nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Digite a sua renda anual: ");
                double rendaTotal = sc.nextDouble();
                System.out.print("Digite os gastos com saúde: ");
                double totalGastoSaude = sc.nextDouble();
                relatorio.add(new PessoaFisica(nome, rendaTotal, totalGastoSaude));
            } else if (tipoPessoa == 'j' || tipoPessoa == 'J') {
                System.out.print("Digite o seu nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Digite a sua renda anual: ");
                double rendaTotal = sc.nextDouble();
                System.out.print("Digite o numero de funcionários: ");
                int totalFuncionarios = sc.nextInt();
                relatorio.add(new PessoaJuridica(nome, rendaTotal, totalFuncionarios));
            }
        }

        for (Pessoa tipo_pessoa : relatorio) {
            System.out.printf(" %s, vai pagar $%.2f", tipo_pessoa.getNome(), tipo_pessoa.imposto());
        }

        double somaImposto = 0.0;
        for (Pessoa tipo_pessoa : relatorio){
            somaImposto += tipo_pessoa.imposto();
        }
    }
}