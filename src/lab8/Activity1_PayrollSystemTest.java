package lab8;
//The following example demonstrates polymorphism for a overridden method.
public class Activity1_PayrollSystemTest {
    public static void main( String[] args ) {
        A1_SalariedEmployee salariedEmployee = new A1_SalariedEmployee ("John",
                "Smith", "111-11-1111", 800.00 );
        A1_HourlyEmployee hourlyEmployee= new A1_HourlyEmployee( "Karen", "Price",
                "222-22-2222", 16.75, 40 );
        A1_CommissionEmployee commissionEmployee = new A1_CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000, .06 );
        A1_BasePlusCommissionEmployee basePlusCommissionEmployee = new
                A1_BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04,
                300 );
        A1_Employee[] employees = new A1_Employee[ 4 ];
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;
        for (int i=0; i<4 ;i++)
        {
            System.out.println(employees[i].earnings()); //polymorphic call
        }
    }

    }
