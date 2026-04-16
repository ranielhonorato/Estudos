/// Exercício simulando a compra de itens em uma loja, para treinar e compreender a utilização de:
/// Classes, enums, composição de classes, data e hora em java.

import entities.*;
 import enums.StatusPedido;

 import java.time.LocalDate;
 import java.time.LocalTime;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("e-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de aniversario: ");
        String dataAniversario = sc.next();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataAniversario, fmt);

        Cliente cliente = new Cliente(nome, email, data);

        System.out.println("\nDigite os dados do pedido: ");
        System.out.print("Status: ");
        sc.nextLine();
        StatusPedido status = StatusPedido.valueOf(sc.next().toUpperCase());

        Pedido pedido = new Pedido(data.atTime(LocalTime.now()), status, cliente);

        System.out.print("Quantos itens para o pedido? ");
        int itensPedido = sc.nextInt();
        for (int i = 0; i < itensPedido; i++) {
            System.out.println("Digite os itens do " + " #" + (i + 1) + " pedido: ");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preco do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);

            pedido.adicionarItens(itemPedido);
        }


        System.out.println("\nRelatorio do pedido: ");
        System.out.println(pedido.toString());

        sc.close();
    }
}