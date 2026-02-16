package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double increasePercent;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary() {
        return (grossSalary * (increasePercent / 100)) + netSalary();
    }

    public String baseSalary() {
        return name + ", " + " $ " + String.format("%.2f", netSalary());
    }

    public String updatedSalaryReport() {
        return name + ", " + " $ " + String.format("%.2f", increaseSalary());
    }
}