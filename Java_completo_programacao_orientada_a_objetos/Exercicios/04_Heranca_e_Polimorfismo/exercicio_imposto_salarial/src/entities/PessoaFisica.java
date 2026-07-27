package entities;

public class PessoaFisica extends Pessoa {
    private double gastoSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {

        double imposto;

        if (getRendaAnual() < 20000) {
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() * 0.25;
        }

        imposto -= getGastoSaude() * 0.5;

        if (imposto < 0.0) {
            imposto = 0.0;
        }
        return imposto;
    }
}
