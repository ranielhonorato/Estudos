import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.Scanner;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario contratado = new Funcionario();
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado();

        System.out.print("Digite o numero de funcionários: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Funcionário #" + (i + 1) + " dados: \n");
            System.out.print("Terceirizado? ");
            sc.nextLine();
            String tipoFuncionario = sc.nextLine();

            if (tipoFuncionario.equalsIgnoreCase("n")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                int horasTrabalhadas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();

                contratado.AddContratados(new Funcionario(nome, horasTrabalhadas, valorHora));

            } else if (tipoFuncionario.equalsIgnoreCase("y")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                int horasTrabalhadas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                System.out.print("Valor adicional: ");
                double valorAdicional = sc.nextDouble();

                contratado.AddContratados(new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, valorAdicional));
            }
        }

        System.out.print("Pagamentos: \n");
        System.out.print(contratado);
        System.out.print(terceirizado);
    }
}
