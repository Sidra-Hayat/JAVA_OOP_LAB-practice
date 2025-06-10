package lab8;
//The following example demonstrates downcasting
public class Activity2_PayrollSystemTest {
    public static void main(String[] args) {
        A1_SalariedEmployee salariedEmployee = new A1_SalariedEmployee("Ali",
                "Raza", "111-11-1111", 800.00);
        A1_HourlyEmployee hourlyEmployee = new A1_HourlyEmployee("Karen", "Price",
                "222-22-2222", 16.75, 40);
        A1_CommissionEmployee commissionEmployee = new A1_CommissionEmployee(
                "Sue", "Ahmad", "333-33-3333", 10000, .06);
        A1_BasePlusCommissionEmployee basePlusCommissionEmployee = new
                A1_BasePlusCommissionEmployee("Laiba", "Mustafa", "444-44-4444", 5000, .04,
                300);
        A1_Employee[] employees = new A1_Employee[4];
// initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        for (int i = 0; i < 4; i++) {
            if (employees[i] instanceof A1_BasePlusCommissionEmployee) {
                A1_BasePlusCommissionEmployee emp = (A1_BasePlusCommissionEmployee)
                        employees[i];
                emp.setBaseSalary(1.10 * emp.getBaseSalary());
                System.out.println("New base salary with 10 percent increase is " +
                        emp.getBaseSalary() );
                employees[i]=emp;
            }
            System.out.println("Earning is " + employees[i].earnings());

            }
        }
    }

