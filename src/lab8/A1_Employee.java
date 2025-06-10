package lab8;

public abstract class A1_Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public A1_Employee ( String first, String last, String s ) {
       this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = s;
    }
    public String toString() {
        return String.format( "social security number:",
                firstName, lastName, socialSecurityNumber );
    } // end method toString
    public abstract double earnings();
}

