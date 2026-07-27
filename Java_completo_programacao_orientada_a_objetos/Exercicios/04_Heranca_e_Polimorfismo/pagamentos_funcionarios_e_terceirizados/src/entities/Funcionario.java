package entities;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorHora;
    List<Funcionario> contratados = new ArrayList<>();

    public Funcionario(){
    }

    public Funcionario(String nome, Integer horas, Double valorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getHoras(){
        return horas;
    }

    public void setHoras(Integer horas){
        this.horas = horas;
    }

    public Double getValorHora(){
        return valorHora;
    }

    public void setValorHora(Double valorHora){
        this.valorHora = valorHora;
    }

    public Double pagamento(){
        return horas * valorHora;
    }

    public void AddContratados(Funcionario funcionario){
        contratados.add(funcionario);
    }

    public void RemoveContratados(String nome){
        contratados.remove(nome);
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
