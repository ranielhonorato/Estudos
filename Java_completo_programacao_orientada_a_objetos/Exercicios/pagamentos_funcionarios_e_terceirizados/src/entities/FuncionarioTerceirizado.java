package entities;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private Double valorAdicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double valorAdiconal){
        super(nome, horas, valorHora);
        this.valorAdicional = valorAdiconal;
    }

    public Double getValorAdicional(){
        return valorAdicional *=  1.1;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + getValorAdicional();
    }


    public void AddContratados(FuncionarioTerceirizado funcionarioTerceirizado){
        super.contratados.add(funcionarioTerceirizado);
    }

    public void RemoveContratados(String nome){
        super.contratados.remove(nome);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (Funcionario funcionario : contratados){
            sb.append(funcionario.getNome());
            sb.append(" - $ ");
            sb.append(String.format("%.2f", funcionario.pagamento()));
            sb.append("\n");
        }

        return sb.toString();
    }
}
