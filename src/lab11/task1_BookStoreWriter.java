package lab11;


    import java.awt.print.Book;
    import java.io.*;
import java.util.ArrayList;

    public class task1_BookStoreWriter{
        public static void main(String[] args) {
            ArrayList<task1_Book> books = new ArrayList<>();

            books.add(new task1_Book("The Alchemist", "HarperCollins", new task1_Person("Paulo Coelho")));
            books.add(new task1_Book("1984", "Secker & Warburg", new task1_Person("George Orwell")));
            books.add(new task1_Book("To Kill a Mockingbird", "J.B. Lippincott & Co.", new task1_Person("Harper Lee")));
            books.add(new task1_Book("Pride and Prejudice", "T. Egerton", new task1_Person("Jane Austen")));
            books.add(new task1_Book("The Great Gatsby", "Charles Scribner's Sons", new task1_Person("F. Scott Fitzgerald")));

            // Writing to file
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("BookStore.txt"))) {
                out.writeObject(books);
                System.out.println("Books written to BookStore.txt successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


