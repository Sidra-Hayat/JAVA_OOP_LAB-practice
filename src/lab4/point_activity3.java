package lab4;
public class point_activity3 {
    private int x;
    private int y;

    public point_activity3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public point_activity3 Add(point_activity3 p1, point_activity3 p2) {
        return new point_activity3(
                this.x + p1.x + p2.x,
                this.y + p1.y + p2.y
        );
    }

    public void display() {
        System.out.println(x);
        System.out.println(y);
    }
}