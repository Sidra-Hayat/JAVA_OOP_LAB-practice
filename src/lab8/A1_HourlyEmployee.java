package lab8;

public class A1_HourlyEmployee extends A1_Employee{
    private double wage; // wage per hour
    private double hours; // hours worked for week
    // five-argument constructor
    public A1_HourlyEmployee( String first, String last, String s,double
            hourlyWage, double hoursWorked )
    {
        super( first, last, s );
        wage  = hourlyWage;
        hours  = hoursWorked;
    }
    @Override
    public double earnings()
    {
        if (hours  <= 40 ) // no overtime
            return wage * hours ;
        else
            return 40 * wage + (hours - 40 ) * wage * 1.5;
    }
}
