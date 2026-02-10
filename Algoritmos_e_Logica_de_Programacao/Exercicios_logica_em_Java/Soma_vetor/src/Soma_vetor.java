import java.util.Scanner;
import java.util.Locale;

public class Soma_vetor {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vet[i]);
        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }
        System.out.println("Soma = " + String.format("%.2f", soma));

        double media = soma / n;
        System.out.println("Media = " + String.format("%.2f", media));

        sc.close();
    }
}
