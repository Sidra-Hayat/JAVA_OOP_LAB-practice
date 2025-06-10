package lab_ass_02;
import java.util.Scanner;
public class PCS_publication {

        private String title;
        private double price;
        // Setter methods
        public void setTitle(String title) {
            this.title = title;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        // Getter methods
        public String getTitle() {
            return title;
        }
        public double getPrice() {return price;}
        // Display method
        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Price: $" + price);
        }
    }


