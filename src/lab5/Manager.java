package lab5;

public class Manager {
    private String title;
    private double dues;
    private Studentrecord std;
    private Employeerecord emp;
    public Manager(String t,double d,Studentrecord s,Employeerecord e){
        this.title=t;
        this.dues=d;
        this.std=s;
        this.emp=e;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDues() {
        return dues;
    }

    public void setDues(double dues) {
        this.dues = dues;
    }

    public Studentrecord getStd() {
        return std;
    }

    public void setStd(Studentrecord std) {
        this.std = std;
    }

    public Employeerecord getEmp() {
        return emp;
    }

    public void setEmp(Employeerecord emp) {
        this.emp = emp;
    }
    public void display(){
        System.out.println("the tittle is: "+title);
        System.out.println("the dues are:  "+dues);
        System.out.println("the employee record is as under:!!");
        System.out.println("the employee id is : "+emp.getEmp_id());
        System.out.println("the employee salary is: "+emp.getSalary());
        System.out.println("the student record is as under:!!");
        System.out.println("the degree is: "+std.getDegree());
    }

}
