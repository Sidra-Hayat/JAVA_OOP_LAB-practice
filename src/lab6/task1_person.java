package lab6;

public class task1_person {
    protected String name;
    protected String phone;
    protected   String address;
    protected String emailaddress;

    public  task1_person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phone = phoneNumber;
        this.emailaddress = email;

    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + emailaddress);

}
    }
