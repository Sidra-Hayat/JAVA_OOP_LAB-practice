package lab4;

import java.util.ArrayList;

public class member {
    private String member_id;
    private String name;
    private ArrayList<book> books_borrowed;

    public member(String id, String Name) {
        this.member_id = id;
        this.name = Name;
        this.books_borrowed = new ArrayList<>();
    }

    public void borrowbooks(book book) {
        if (book.isAvailable()) {
            books_borrowed.add(book);
            book.setAvailable(false);

            System.out.println(name + " borrows " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is unavailable");
        }
    }

    public void return_book(book book) {
        if (books_borrowed.contains(book)) {
            books_borrowed.remove(book);
            book.setAvailable(true);

            System.out.println(name + " returns " + book.getTitle());
        }
    }
}