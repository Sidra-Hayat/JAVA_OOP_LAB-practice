package lab8;

public class A1_BasePlusCommissionEmployee extends A1_CommissionEmployee{
    private double baseSalary; // base salary per week

    public A1_BasePlusCommissionEmployee( String first, String last,String
            s, double sales, double rate, double salary )
    {
        super( first, last, s, sales, rate );
        baseSalary = salary; // validate and store base salary
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;}
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}
