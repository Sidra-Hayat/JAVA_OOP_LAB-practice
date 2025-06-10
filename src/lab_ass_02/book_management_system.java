package lab_ass_02;

public class book_management_system {
    public static void main(String[] args) {
                // Create two Book objects
        BMS_book book1 = new BMS_book();  // No-argument constructor
        BMS_book book2 = new BMS_book("J.K. Rowling", new String[] {"Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4"});
        // Use setter methods to assign values to the first book
        book1.setAuthor("J.R.R. Tolkien");
        book1.setChapterNames(new String[]{"Prologue", "Chapter 1", "Chapter 2", "Chapter 3"});
        // Display the books' information
        System.out.println("Book 1 Information:");
        book1.displayBookInfo();
        System.out.println("\nBook 2 Information:");
        book2.displayBookInfo();
        // Compare authors
        System.out.println("\nComparing authors of Book 1 and Book 2: ");
        if (book1.compareBooks(book2)) {
            System.out.println("Both books have the same author.");
        } else {
            System.out.println("The books have different authors.");
        }
        // Compare the number of chapters
        BMS_book bookWithMoreChapters = book1.compareChapterNames(book2);
        System.out.println("\nBook with more chapters: ");
        bookWithMoreChapters.displayBookInfo();
    }
}



