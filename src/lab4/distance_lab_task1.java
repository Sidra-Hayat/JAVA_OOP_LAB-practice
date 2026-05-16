package lab4;

public class distance_lab_task1 {
    private int feet;
    private int inches;

    public distance_lab_task1() {
        this.feet = 0;
        this.inches = 0;
    }

    public distance_lab_task1(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public distance_lab_task1 add(distance_lab_task1 d) {
        int totalInches = this.inches + d.inches;
        int totalFeet = this.feet + d.feet + totalInches / 12;
        totalInches = totalInches % 12;

        return new distance_lab_task1(totalFeet, totalInches);
    }
}