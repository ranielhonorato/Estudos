import model.entites.AluguelCarro;
import model.entites.Veiculo;
import model.services.ImpostoBrasil;
import model.services.ServicoAluguel;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        System.out.println("Digite os dados do aluguel: ");
        System.out.print("Moodelo do carro: ");
        String modeloVeiculo = sc.nextLine();
        System.out.print("Retirada (DD/MM/YYY HH:MM): ");
        LocalDateTime dataInicio = LocalDateTime.parse(sc.nextLine(), formatacaoData);
        System.out.print("Devolucao (DD/MM/YYYY HH:MM): ");
        LocalDateTime dataFinal = LocalDateTime.parse(sc.nextLine(), formatacaoData);

        AluguelCarro aluguelCarro = new AluguelCarro(dataInicio, dataFinal, new Veiculo(modeloVeiculo));

        System.out.print("Digite o preco por hora: ");
        double precoPorHora = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o preco por dia: ");
        double precoPorDia = Double.parseDouble(sc.nextLine());

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new ImpostoBrasil());

        servicoAluguel.processarFatura(aluguelCarro);

        System.out.println("Fatura: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
        System.out.println("Pagamento total: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoTotal()));


        sc.close();
    }
}