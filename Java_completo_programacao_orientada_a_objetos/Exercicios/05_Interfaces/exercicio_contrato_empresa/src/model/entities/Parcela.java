package model.entities;

import java.time.LocalDate;

public class Parcela {
    private LocalDate dataVencimento;
    private Double valorParcela;

    public Parcela() {
    }

    public Parcela(LocalDate dataVencimento, Double valorParcela) {
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getDataVencimento() + " - " + String.format("%.2f", getValorParcela()) + "\n");

        return sb.toString();
    }
}