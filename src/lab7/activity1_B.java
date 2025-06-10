package lab7;

public class activity1_B extends activity1_A{
    int k;
   public  activity1_B(int a, int b, int c) {
        super(a, b);
        k = c;
   }
    // display k – this overrides show() in A
  public   void show() {
        System.out.println("k: " + k);
    }
}
