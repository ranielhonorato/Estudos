import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProdutos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Produto #" + (i + 1));
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            String tipoProduto = sc.next();

            switch (tipoProduto) {
                case "c": {
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    Double preco = sc.nextDouble();

                    produto.adicionarProduto(new Produto(nome, preco));
                    break;
                }
                case "u": {
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    Double preco = sc.nextDouble();
                    System.out.print("Data de fabricação: ");
                    sc.nextLine();
                    String dataTexto = sc.nextLine();

                    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataFormatada = LocalDate.parse(dataTexto, formatoData);
                    produto.adicionarProduto(new ProdutoUsado(nome, preco, dataFormatada));
                    break;
                }
                case "i": {
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    Double preco = sc.nextDouble();
                    System.out.print("Taxa aduaneira: ");
                    Double taxaAduaneira = sc.nextDouble();


                    produto.adicionarProduto(new ProdutoImportado(nome, preco, taxaAduaneira));
                }
            }

        }


        System.out.print(produto.imprimirEtiquetas());

        sc.close();
    }
}