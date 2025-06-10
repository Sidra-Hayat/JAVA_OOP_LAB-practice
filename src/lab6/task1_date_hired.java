package lab6;
import java.util.Date;
public class task1_date_hired {
    private Date joiningDate;

    public task1_date_hired(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public task1_date_hired(int i, int i1, int i2) {
    }

    public void displayEmployeeDetails() {
        System.out.println("Joining Date: " + joiningDate.toString());

    }
}
