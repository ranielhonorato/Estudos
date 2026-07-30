package model.services;

public class ServicoPaypal implements ServicoPagamento {

    @Override
    public double taxaPagamento(double quantia) {
        return quantia * 0.02;
    }

    @Override
    public double juros(double quantia, int meses) {

        return quantia * 0.01 * meses;

    }
}
