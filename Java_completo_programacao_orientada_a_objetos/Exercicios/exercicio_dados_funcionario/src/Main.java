import java.util.Scanner;
import java.util.Locale;

import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee.reportBaseSalary());

        System.out.println();
        System.out.println("Whic percentage to increase salary? ");
        employee.increasePercent = sc.nextDouble();

        System.out.println();
        System.out.println("Update data: " + employee.reportSalaryMorePercent());


        sc.close();
    }
}