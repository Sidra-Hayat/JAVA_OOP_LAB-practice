package theory_assignment_02;

public class Library_management_system {
    public static void main(String[] args) {
                // Create books
                LMS_book book1 = new LMS_book(101, "Java Programming", "Herbert Schildt");
                LMS_book book2 = new LMS_book(102, "Data Structures and Algorithms", "Mark Allen Weiss");

                // Create users
                LMS_library_user user1 = new LMS_library_user(1, "Alice");
                LMS_library_user user2 = new LMS_library_user(2, "Bob");

                // Create library system
                LMS_library library = new LMS_library();

                // Add books to library
                library.addBook(book1);
                library.addBook(book2);

                // Show available books in the library
                System.out.println("\nAvailable books in library:");
                library.showAvailableBooks();
                // Alice borrows a book
                library.borrowBook(book1, user1);

                // Show borrowed books by Alice
                System.out.println("\nBorrowed books by Alice:");
                user1.getBorrowedBooks();

                // Show available books after borrowing
                System.out.println("\nAvailable books in library after borrowing:");
                library.showAvailableBooks();

                // Alice returns the book
                library.returnBook(book1, user1);

                // Show borrowed books after returning
                System.out.println("\nBorrowed books by Alice after returning:");
                user1.getBorrowedBooks();

                // Show available books after returning
                System.out.println("\nAvailable books in library after returning:");
                library.showAvailableBooks();
            }
        }




