package Lab_assignment_03;

public class Student_s1b extends Person_s1a {
    private double CGPA;

    public Student_s1b(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public Boolean isOutstanding() {
        if (CGPA > 3.5) {
            return true;
        } else {
            return false;
        }

    }
}

