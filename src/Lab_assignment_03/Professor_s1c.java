package Lab_assignment_03;

public class Professor_s1c extends Person_s1a {
    private int numberOfPublications;
    public Professor_s1c(String name, int numberOfPublications){
        super(name);
        this.numberOfPublications=numberOfPublications;

    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public Boolean isOutstanding() {
        if(numberOfPublications>50){
            return true;
        }else{
            return false;
        }
    }
}
