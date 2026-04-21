package entities;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {
    private LocalDate dataDeFabricacao;

    public ProdutoUsado(){}

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeFabricacao){
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s $ %.2f (Data de fabricação: ", getNome(), getPreco())).append(dataDeFabricacao + ")");

        return sb.toString();
    }
}
