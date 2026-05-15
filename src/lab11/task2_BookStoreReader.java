package lab11;

    import java.io.*;
import java.util.ArrayList;

    public class task2_BookStoreReader{

        // Method to read and display all books in "BookStore"
        public static void displayBooks() {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("BookStore"))) {

                // Assuming the file contains an ArrayList<Book>
                ArrayList<task1_Book> books = (ArrayList<task1_Book>) in.readObject();

                for (task1_Book book : books) {
                    System.out.println(book);
                }

            } catch (FileNotFoundException e) {
                System.out.println("File 'BookStore' not found.");
            } catch (EOFException e) {
                // End of file reached - no more objects
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Test main method
        public static void main(String[] args) {
            displayBooks();
        }
    }


