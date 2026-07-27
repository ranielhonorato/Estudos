package model.entites;

public class Fatura extends AluguelCarro {
    private Double pagamentoBasico;
    private Double taxa;
    private Double pagamentoTotal;

    public Fatura() {
    }

    public Fatura(Double pagamentoBasico, Double taxa) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxa = taxa;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getTaxa() {
        return taxa;
    }

    public Double getPagamentoTotal() {
        return getPagamentoBasico() + getTaxa();
    }

}
