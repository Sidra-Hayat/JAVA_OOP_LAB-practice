package theory_assignment_02;
import java.util.ArrayList;

public class LMS_library {

        private ArrayList<LMS_book> books;

        // Constructor
        public LMS_library() {
            books = new ArrayList<>();
        }
        // Add a book to the library
        public void addBook(LMS_book book) {
            books.add(book);
            System.out.println("Book added to library: " + book.getBookDetails());
        }
        // Borrow a book from the library
        public void borrowBook(LMS_book book, LMS_library_user user) {
            if (books.contains(book)) {
                books.remove(book);
                user.borrowBook(book);
            } else {
                System.out.println("The book '" + book.getBookDetails() + "' is not available in the library.");
            }
        }
        // Return a book to the library
        public void returnBook(LMS_book book, LMS_library_user user) {
            user.returnBook(book);
            books.add(book);
            System.out.println("The book '" + book.getBookDetails() + "' has been returned to the library.");
        }

        // Display available books in the library
        public void showAvailableBooks() {
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                for (LMS_book book : books) {
                    System.out.println(book.getBookDetails());
                }
            }
        }
    }





