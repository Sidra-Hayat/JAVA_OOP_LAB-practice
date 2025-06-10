package Lab_assignment_03;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Scenario_3_RandomBox <T>{
    private List<T> items;
    private Random random;

    public Scenario_3_RandomBox() {
        items = new ArrayList<>();
        random = new Random();
    }

    // Method to add an item to the box
    public void add(T item) {
        items.add(item);
    }

    // Method to check if the box is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Method to draw a random item from the box
    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = random.nextInt(items.size());
        return items.remove(index); // Optional: remove to simulate a one-time draw
    }

    // Main method to test the RandomBox class
    public static void main(String[] args) {
        Scenario_3_RandomBox<String> nameBox = new Scenario_3_RandomBox<>();
        nameBox.add("Ali");
        nameBox.add("Baber");
        nameBox.add("Ahmad");

        System.out.println("Drawing names:");
        while (!nameBox.isEmpty()) {
            System.out.println(nameBox.drawItem());
        }

        Scenario_3_RandomBox<Integer> numberBox = new Scenario_3_RandomBox<>();
        numberBox.add(5);
        numberBox.add(12);
        numberBox.add(27);

        System.out.println("\nDrawing numbers:");
        while (!numberBox.isEmpty()) {
            System.out.println(numberBox.drawItem());
        }

        // Attempt to draw from an empty box
        System.out.println("\nAttempting to draw from an empty box:");
        System.out.println("Result: " + nameBox.drawItem()); // should print: Result: null
    }
}
