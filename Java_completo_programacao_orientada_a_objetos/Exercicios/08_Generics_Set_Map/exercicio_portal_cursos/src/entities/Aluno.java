package entities;

import java.util.Objects;

public class Aluno {
    private int id;

    public Aluno() {
    }

    public Aluno(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id == aluno.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
