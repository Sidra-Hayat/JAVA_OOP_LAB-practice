package theory_assignment_02;

import java.util.ArrayList;

public class LMS_library_user {

    private int userId;
    private String userName;
    private ArrayList<LMS_book> borrowedBooks;

    // Constructor
    public LMS_library_user(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.borrowedBooks = new ArrayList<>();
    }

    // Borrow a book
    public void borrowBook(LMS_book book) {
        borrowedBooks.add(book);
        System.out.println(userName + " has borrowed the book: " + book.getBookDetails());
    }

    // Return a book
    public void returnBook(LMS_book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(userName + " has returned the book: " + book.getBookDetails());
        } else {
            System.out.println(userName + " has not borrowed this book.");
        }
    }

    // Display borrowed books
    public void getBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(userName + " has no borrowed books.");
        } else {
            for (LMS_book book : borrowedBooks) {
                System.out.println(book.getBookDetails());
            }
        }
    }
}





