package model.services;

import model.entites.AluguelCarro;
import model.entites.Fatura;

import java.time.Duration;

public class ServicoAluguel {
    private Double precoPorHora;
    private Double precoPorDia;

    private ServicoImposto servicoImposto;

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, ServicoImposto servicoImposto) {
        super();
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.servicoImposto = servicoImposto;
    }

    public void processarFatura(AluguelCarro aluguelCarro) {
        double minutos = Duration.between(aluguelCarro.getDataInicio(), aluguelCarro.getDataFim()).toMinutes();
        double horas = minutos / 60.0;

        double pagamentoBasico;
        if (horas <= 12.0) {
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
        }

        double impostoGerado = servicoImposto.imposto(pagamentoBasico);


        aluguelCarro.setFatura(new Fatura(pagamentoBasico, impostoGerado));
    }
}
