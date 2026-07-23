package entities;

public class PessoaJuridica extends Pessoa {
    private int numeroFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionario;
    }

    @Override
    public double imposto() {
        double imposto;
        if (numeroFuncionarios <= 10) {
            imposto = 0.16 * getRendaAnual();
        } else {
            imposto = 0.14 * getRendaAnual();
        }

        return imposto;
    }

}
