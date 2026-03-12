 import entities.*;
 import enums.StatusPedido;

 import java.time.LocalDate;
 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

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
        pedido.setCliente(cliente);

        System.out.println("\nDigite os dados do pedido: ");
        System.out.print("Status: ");
        sc.nextLine();
        String statusDigitado = sc.nextLine();
        StatusPedido status = StatusPedido.valueOf(statusDigitado.toUpperCase());
        pedido.setStatus(status);

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
            ItemPedido item = new ItemPedido(quantidadeProduto, precoProduto, produto);
            pedido.adicionarItens(item);
        }

        LocalDateTime momentoAtual = LocalDateTime.now();
        pedido.setMomento(momentoAtual);

        System.out.println("\nRelatorio do pedido: ");
        System.out.println(pedido.toString());

     sc.close();
    }
}