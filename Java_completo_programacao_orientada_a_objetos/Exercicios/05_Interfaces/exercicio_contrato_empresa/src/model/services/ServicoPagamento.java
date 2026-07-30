package model.services;

public interface ServicoPagamento {
    double taxaPagamento(double quantia);

    double juros(double quantia, int meses);
}
