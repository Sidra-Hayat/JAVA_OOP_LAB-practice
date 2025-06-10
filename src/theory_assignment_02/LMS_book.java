package theory_assignment_02;

public class LMS_book {
        private int bookId;
        private String title;
        private String author;
        // Constructor
        public LMS_book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }
        // Getter methods to access book data
        public int getBookId() {
            return bookId;
        }
        public String getTitle() {return title;}
        public String getAuthor() {
            return author;
        }

        // Method to display book details
        public String getBookDetails() {
            return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
        }
    }



