package lab5;

public class Activity1 {

    public static void main(String[] args) {
        // activity 1
        Studentrecord s = new Studentrecord();
        s.setDegree("BBA");
        Employeerecord e = new Employeerecord();
        e.setSalary(50000);
        e.setEmp_id(751);
        Manager m1 = new Manager("ali", 7000, s, e);
        m1.display();

    }
}
