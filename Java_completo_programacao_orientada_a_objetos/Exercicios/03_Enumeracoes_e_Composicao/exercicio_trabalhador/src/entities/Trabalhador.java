package entities;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private double salarioBase;
    private NivelTrabalhador nivelTrabalhador;

    private Departamento departamento;
    private final List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, double salarioBase, NivelTrabalhador nivelTrabalhador, Departamento departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivelTrabalhador = nivelTrabalhador;
        this.departamento = departamento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public NivelTrabalhador getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void adicionarContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double rendaTotal(int mes, int ano) {

        double soma = salarioBase;
        for (ContratoHora c : contratos) {

            if (c.getData().getMonthValue() == mes && c.getData().getYear() == ano) {
                soma += c.valorTotal();
            }
        }

        return soma;
    }

}