package lab_ass_02;

public class PCS_derived_book extends PCS_publication  {

    private int pageCount;

    // Setter and Getter methods for pageCount
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    // Override the display method to include pageCount
    @Override
    public void display() {
        super.display();  // Display the title and price from the Publication class
        System.out.println("Page Count: " + pageCount);
    }
}
