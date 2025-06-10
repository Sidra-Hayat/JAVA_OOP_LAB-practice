package lab5;

public class activity2_employee {
    private String name;
    private String fname;
    private activity2_date birthdate;
    private activity2_date hiredate;

   public activity2_employee() {

    }

   public activity2_employee(String x, String y, activity2_date
            birthofDate,  activity2_date dateofHire) {
        name = x;
        fname = y;
        birthdate = birthofDate;
        hiredate = dateofHire;

    }

    public void setname(String x) {
        name = x;
    }

    public String getname() {
        return name;

    }

    public void setfname(String x) {
        fname = x;
    }
    public String getfname() {
        return fname;
    }

    public void setbirthdate(activity2_date b) {
        birthdate = b;

    }

    public activity2_date getbirthdate() {
        return birthdate;

    }

    public void sethiredate(activity2_date h) {
        hiredate = h;
    }

    public activity2_date gethiredate() {
        return hiredate;
    }
    public void display() {

        System.out.println("Name: " + name + "Father Name: " + fname);
        birthdate.display();
        hiredate.display();

    }
}
