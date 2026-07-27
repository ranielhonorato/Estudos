package model.entites;

import java.time.LocalDateTime;

public class AluguelCarro {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime dataInicio, LocalDateTime dataFim, Veiculo veiculo) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.veiculo = veiculo;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
