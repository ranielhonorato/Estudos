package entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private Double preco;
    private List<Produto> listaProdutos = new ArrayList<>();

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s $ %.2f ", nome, preco));
        return sb.toString();
    }

    public String imprimirEtiquetas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Etiquetas: \n");

        for (Produto produtos : listaProdutos) {
            sb.append(produtos.toString()).append("\n");
        }
        return sb.toString();
    }
}
