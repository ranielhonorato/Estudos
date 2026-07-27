package entities;

public class ProdutoImportado extends Produto{
    private Double taxaAduaneira;
    private Double precoTotal;

    public ProdutoImportado(String nome, Double preco, Double taxaAduaneira){
        super(nome, preco);
        this.taxaAduaneira = taxaAduaneira;
        this.precoTotal = preco + taxaAduaneira;
    }


    public void taxaAduaneira(Double taxaAduaneira){
        this.taxaAduaneira = taxaAduaneira;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s $ %.2f (Taxa aduaneira: $ %.2f)", getNome(), precoTotal, taxaAduaneira ));

        return sb.toString();
    }

}
