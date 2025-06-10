package lab8;

public class A1_SalariedEmployee extends A1_Employee {
    private double weeklySalary;
    // four-argument constructor
    public A1_SalariedEmployee( String first, String last, String ssn,double
            salary ) {
        super( first, last, ssn ); // pass to Employee constructor
        weeklySalary = salary ;
    }
    @Override
    public double earnings() {
        return weeklySalary;
    }
}
