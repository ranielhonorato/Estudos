package model.services;

import model.entities.Contrato;
import model.entities.Parcela;

import java.time.LocalDate;

public class ServicoContrato {
    private Contrato contrato;
    private ServicoPagamento servicoPagamento;
    private Integer meses;

    public ServicoContrato() {
    }


    public void processarContrato(Contrato contrato, Integer meses, ServicoPagamento servicoPagamento) {

        Double valorInicialParcela = contrato.getValorTotalContrato() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate dataVencimento = contrato.getDataContrato().plusMonths(i);

            double valorJuros = servicoPagamento.juros(valorInicialParcela, i);
            double valorTaxaPagamento = servicoPagamento.taxaPagamento(valorInicialParcela + valorJuros);
            double valorFinalParcela = valorInicialParcela + valorTaxaPagamento + valorJuros;

            contrato.getParcelas().add(new Parcela(dataVencimento,valorFinalParcela));
        }
    }
}
