import lab5.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // activity 1
//        Studentrecord s=new Studentrecord();
//        s.setDegree("BBA");
//        Employeerecord e=new Employeerecord();
//        e.setSalary(50000);
//        e.setEmp_id(751);
//        Manager m1=new Manager("ali",7000,s,e);
//        m1.display();


        //activity 2
        activity2_date b = new activity2_date(1, 12, 1990);
        activity2_date h = new activity2_date(5, 6, 2016);
        activity2_employee e1 = new activity2_employee("xxx", "yyyy",b, h);


e1.display();
    }
    }
