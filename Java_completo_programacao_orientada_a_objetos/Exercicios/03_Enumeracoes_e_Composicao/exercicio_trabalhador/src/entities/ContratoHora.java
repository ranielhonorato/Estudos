package entities;

import java.time.LocalDate;

public class ContratoHora {
    private LocalDate data;
    private int horas;
    private double valorHora;

    public ContratoHora() {
    }

    public ContratoHora(LocalDate data, int horas, Double valorHora) {
        this.data = data;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    public double valorTotal(){
        return valorHora * horas;
    }

}