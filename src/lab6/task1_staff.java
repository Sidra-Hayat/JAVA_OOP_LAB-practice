package lab6;

public class task1_staff extends task1_employee {
   protected String title;
   private String titlen;

   public task1_staff(String name, String address, String phoneNumber, String email, String office, double salary, task1_date_hired dateHired, String title) {
      super(name, address, phoneNumber, email, office, salary, dateHired);
      this.title = title;
   }

   @Override
   public void display() {
      super.display();
      System.out.println("Title: " + title);
   }
}
