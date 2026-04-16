package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate dataAniversario;

    public Cliente() {
    }

    public Cliente(String nome, String email, LocalDate dataAniversario) {
        this.nome = nome;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public Cliente(String nome, String email, LocalDateTime data) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("\nCliente: " + nome);
        sb.append(" (" + dataAniversario + ")");
        sb.append(" - " + email);

        return sb.toString();
    }
}
