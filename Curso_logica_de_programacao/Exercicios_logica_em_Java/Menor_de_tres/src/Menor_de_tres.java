import java.util.Scanner;
import java.util.Locale;

public class Menor_de_tres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        int menor;

        if (a < b && a < c) {
            menor = a;
        } else if (b < c) {
            menor = b;
        } else {
            menor = c;
        }


        System.out.print("Menor = " + menor);

        sc.close();
    }
}
