package lab11;
import java.io.Serializable;
public class task1_Book implements Serializable  {



        private String name;
        private String publisher;
        private task1_Person author;

        public task1_Book(String name, String publisher, task1_Person author) {
            this.name = name;
            this.publisher = publisher;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book: " + name + ", Publisher: " + publisher + ", Author: " + author;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public task1_Person getAuthor() {
        return author;
    }

    public void setAuthor(task1_Person author) {
        this.author = author;
    }
}


