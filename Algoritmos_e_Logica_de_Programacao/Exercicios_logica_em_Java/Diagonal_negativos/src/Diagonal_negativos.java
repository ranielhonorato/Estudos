import java.util.Scanner;
import java.util.Locale;

public class Diagonal_negativos {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] vet = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + i + "]: ");
                vet[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vet[i][i]);
        }

        int somaNegativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vet[i][j] < 0) {
                    somaNegativos += 1;
                }
            }
        }

        System.out.println();
        System.out.print("Quantidade de negativos = " + somaNegativos);

        sc.close();
    }
}
