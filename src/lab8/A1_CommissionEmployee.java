package lab8;

public class A1_CommissionEmployee extends A1_Employee{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // five-argument constructor
    public A1_CommissionEmployee( String first, String last, String
            ssn,double sales, double rate )
    {
        super( first, last, ssn );
        grossSales =sales ;
        commissionRate  =rate;
    }

    @Override
    public double earnings()
    {
        return commissionRate  * grossSales ;
    }
}
