import java.util.Scanner;
import java.util.Locale;

public class retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

        System.out.println("Area = " + String.format("%.2f", area));
        System.out.println("Area = " + String.format("%.2f", perimetro));
        System.out.println("Area = " + String.format("%.2f", diagonal));

        sc.close();
    }
}
