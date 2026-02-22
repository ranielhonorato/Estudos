package entities;

public class Aluno {
    private String nome;
    private double primeiroSemestre;
    private double segundoSemestre;

    public Aluno() {
    }

    public Aluno(String nome, double primeiroSemestre, double segundoSemestre){
        this.nome = nome;
        this.primeiroSemestre = primeiroSemestre;
        this.segundoSemestre = segundoSemestre;
    }

    public String getNome(){
        return nome;
    }
    public double getPrimeiroSemestre() {
        return primeiroSemestre;
    }

    public double getSegundoSemestre(){
        return segundoSemestre;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPrimeiroSemestre(double primeiroSemestre){
        this.primeiroSemestre = primeiroSemestre;
    }

    public void setSegundoSemestre(double segundoSemestre){
        this.segundoSemestre = segundoSemestre;
    }
}
