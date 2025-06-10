package lab6;

public class task1_student extends task1_person {
    private String status;


    // Constructor
    public task1_student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    // Method to display student information
    @Override
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}



