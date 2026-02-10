import java.util.Scanner;
import java.util.Locale;

public class Crescente {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }

            System.out.println("Digite outros dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
