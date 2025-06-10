package lab_ass_02;
import java.util.Scanner;
public class publishing_com_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create Book instance and get details from the user
                System.out.println("Enter details for the Book:");
        PCS_derived_book book = new PCS_derived_book();

                System.out.print("Enter title: ");
                String bookTitle = scanner.nextLine();
                book.setTitle(bookTitle);

                System.out.print("Enter price: ");
                double bookPrice = scanner.nextDouble();
                book.setPrice(bookPrice);

                System.out.print("Enter page count: ");
                int bookPageCount = scanner.nextInt();
                book.setPageCount(bookPageCount);

                // Clear the buffer
                scanner.nextLine();

                // Create Tape instance and get details from the user
                System.out.println("\nEnter details for the Tape:");
        PCS_derived_tape tape = new PCS_derived_tape();

                System.out.print("Enter title: ");
                String tapeTitle = scanner.nextLine();
                tape.setTitle(tapeTitle);

                System.out.print("Enter price: ");
                double tapePrice = scanner.nextDouble();
                tape.setPrice(tapePrice);
                System.out.print("Enter playing time (in minutes): ");
                int tapePlayingTime = scanner.nextInt();
                tape.setPlayingTime(tapePlayingTime);
                // Display details of the Book and Tape
                System.out.println("\nBook Details:");
                book.display();

                System.out.println("\nTape Details:");
                tape.display();


            }
        }

