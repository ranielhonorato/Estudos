package model.entities;

import model.exceptions.DomainException;

public class Conta {
    private int id;
    private String nome;
    private double saldo;
    private double limiteSaque;

    public Conta() {
    }

    public Conta(int id, String nome, double saldo, double limiteSaque) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void setId() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void deposito(double deposito) {
        saldo += deposito;
    }

    public void validarSaque(double saque) {
        if (saldo < saque) {
            throw new DomainException("Saldo insuficiente para sacar!");
        }
        else if (limiteSaque < saldo) {
            throw new DomainException("A solicitação de saque é maior que o limite permitido");
        }
        saldo -= saque;
    }
}