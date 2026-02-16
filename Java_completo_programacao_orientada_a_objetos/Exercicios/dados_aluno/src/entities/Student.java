package entities;

public class Student {
    public String name;
    public double firstSemester;
    public double secondSemester;
    public double thirdSemester;

    public double finalNote() {
        return firstSemester + secondSemester + thirdSemester;
    }

    public void pass() {
        System.out.printf("Final grade = %.2f\n", finalNote());

        if (finalNote() >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
            double passingGrade = 60;
            System.out.println("Missing " + (passingGrade - finalNote()) + " points");
        }
    }
}
