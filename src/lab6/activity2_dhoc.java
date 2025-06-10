package lab6;

public class activity2_dhoc extends activity2_Employee{
    private int numberOfWorkingDays; private int wage;

    public activity2_dhoc(String name, String phone, String address,
                 int allowance, int numberOfWorkingDays, int wage)
    {
        super(name, phone, address, allowance);
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.wage = wage;
    }

    public void Display()
    {
        System.out.println("Name: " + name + "Phone Number: " + phone
                +"Address: " + address +   "Allowance: "    +   allowance   +
                "Number    Of   Working   Days: " + numberOfWorkingDays + "Wage: " +
                wage);
    }

}
