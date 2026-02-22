package entities;

public class Student {
    public String name;
    public double firstSemester;
    public double secondSemester;
    public double thirdSemester;

    public double finalNote() {
        return firstSemester + secondSemester + thirdSemester;
    }

    public double missingPoints() {
        if (finalNote() <= 60) {
            return 60.0 - finalNote();
        } else {
            return 0.0;
        }
    }
}
