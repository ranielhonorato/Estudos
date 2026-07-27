package model.services;

public class ImpostoBrasil implements ServicoImposto {

    public double imposto(double quantia) {
        if (quantia <= 100) {
            return quantia * 0.20;
        } else {
            return quantia * 0.15;
        }
    }

}
