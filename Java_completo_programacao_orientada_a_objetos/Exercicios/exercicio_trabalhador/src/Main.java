import entities.ContratoHora;
import entities.Departamento;
import entities.NivelTrabalhador;
import entities.Trabalhador;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelDigitado = sc.nextLine();
        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();

        NivelTrabalhador nivel = NivelTrabalhador.valueOf(nivelDigitado.toUpperCase());
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, salarioBase, nivel, new Departamento(nomeDepartamento));

        System.out.println();
        System.out.print("Quantos contratos para este trabalhador? ");
        int totalContratos = sc.nextInt();

        for (int i = 0; i < totalContratos; i++) {
            System.out.println("Digite os dados do #" + (i + 1) + " contrato");

            System.out.print("Data (DD/MM/YYYY):  ");
            LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);

            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            System.out.print("Duracao (horas): ");
            int horas = sc.nextInt();

            ContratoHora contrato = new ContratoHora(dataContrato, horas, valorHora);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.print("Digite o mes e o ano para calcular a renda total: ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        double rendaTotal = trabalhador.rendaTotal(mes, ano);

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda total em: " + mesAno + ": " + String.format("%.2f", trabalhador.rendaTotal(mes, ano)));

        sc.close();
    }
}