import java.util.Scanner;
import java.util.Locale;

public class Soma_impares {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int troca;
        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }

        int soma = 0;
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.print("Soma dos impares = " + soma);

        sc.close();
    }
}
