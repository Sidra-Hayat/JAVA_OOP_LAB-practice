package lab11;
    import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class  task3_BookStoreSearch {

        public static void searchBookByName() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of the book to search: ");
            String searchName = scanner.nextLine().trim();

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("BookStore"))) {
                ArrayList<task1_Book> books = (ArrayList<task1_Book>) in.readObject();

                boolean found = false;
                for (task1_Book book : books) {
                    if (book.getName().equalsIgnoreCase(searchName)) {
                        System.out.println("Book found: " + book);
                        found = true;
                        break;  // Remove break if you want to find all matches
                    }
                }

                if (!found) {
                    System.out.println("No book found with the name: " + searchName);
                }

            } catch (FileNotFoundException e) {
                System.out.println("File 'BookStore' not found.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Test main method
        public static void main(String[] args) {
            searchBookByName();
        }
    }


