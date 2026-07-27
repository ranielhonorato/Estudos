import entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> lista = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo: ");
        String caminhoDigitado = sc.nextLine();

        File caminhoArquivo = new File(caminhoDigitado);
        String origemPasta = caminhoArquivo.getParent();

        boolean pastaCriada = new File(origemPasta + "\\saida").mkdir();

        String caminhoCriarArquivo = origemPasta + "\\saida\\summary.csv";

        try (BufferedReader lerArquivo = new BufferedReader(new FileReader(caminhoDigitado))) {

            String itemCsv = lerArquivo.readLine();

            while (itemCsv != null) {
                String[] itens = itemCsv.split(",");
                String nome = itens[0];
                double preco = Double.parseDouble(itens[1]);
                int quantidade = Integer.parseInt(itens[2]);

                lista.add(new Produto(nome, preco, quantidade));

                itemCsv = lerArquivo.readLine();
            }

            try (BufferedWriter escreverNovoArquivo = new BufferedWriter(new FileWriter(caminhoCriarArquivo))) {
                for (Produto item : lista) {
                    escreverNovoArquivo.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    escreverNovoArquivo.newLine();
                }

                System.out.println(caminhoCriarArquivo + " Criado!");

            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.print("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
