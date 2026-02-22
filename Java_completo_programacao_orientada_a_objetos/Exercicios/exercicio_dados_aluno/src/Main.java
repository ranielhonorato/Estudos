import entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Digite a nota do primeiro trimestre: ");
        student.firstSemester = sc.nextDouble();
        System.out.print("Digite a nota do segundo trimestre: ");
        student.secondSemester = sc.nextDouble();
        System.out.print("Digite a nota do terceiro trimestre: ");
        student.thirdSemester = sc.nextDouble();

        System.out.println(student.name);
        System.out.printf("Final grade = %.2f%n", student.finalNote());

        if (student.finalNote() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", student.missingPoints());
        }

        sc.close();
    }
}