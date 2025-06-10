package Lab_assignment_03;

public abstract  class Person_s1a {
    private String name;
    public Person_s1a(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract Boolean isOutstanding();
}
