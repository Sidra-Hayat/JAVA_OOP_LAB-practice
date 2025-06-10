package theory_assignment_04;
import java.util.Scanner;
public class TechBookHubApp_s1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PurchaseManager_s1  manager = new PurchaseManager_s1 ();

            try {
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();

                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                System.out.print("Enter Book Title: ");
                String bookTitle = scanner.nextLine();

                manager.savePurchase(username, email, bookTitle);
            } catch (Exception e) {
                System.err.println("Unexpected Error: " + e.getMessage());
            } finally {

            }
            System.out.println("sp24_bcs_093");
            System.out.println("sidra hayat");
        }
    }


