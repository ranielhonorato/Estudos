import model.entities.Contrato;
import model.services.ServicoContrato;
import model.services.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato: ");
        System.out.print("Numero: ");
        int numeroContrato = Integer.parseInt(sc.nextLine());
        System.out.print("Data do contrato (DD/MM/YYYY): ");
        LocalDate dataContrato = LocalDate.parse(sc.nextLine(), formatacaoData);
        System.out.print("Valor do contrato: ");
        double valorContrato = Double.parseDouble(sc.nextLine());

        Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);

        System.out.print("Digite o numero de parcelas: ");
        int numeroParcelas = Integer.parseInt(sc.nextLine());

        ServicoContrato servicoContrato = new ServicoContrato();
        servicoContrato.processarContrato(contrato, numeroParcelas, new ServicoPaypal());

        System.out.println("Parcelas: ");
        System.out.println(contrato);

    }
}