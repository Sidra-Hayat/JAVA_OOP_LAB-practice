package lab_ass_02;

public class POS_pizza_order {

        private POS_pizza[] pizzas;  // Array to hold up to 3 pizzas
        private int pizzaCount;  // Keeps track of the number of pizzas in the order

        // Constructor to initialize the pizza array
        public POS_pizza_order() {
            pizzas = new POS_pizza[3];  // Can hold up to 3 pizzas
            pizzaCount = 0;
        }

        // Method to add a pizza to the order
        public void addPizza(POS_pizza pizza) {
            if (pizzaCount < 3) {
                pizzas[pizzaCount++] = pizza;
            } else {
                System.out.println("Cannot add more than 3 pizzas to the order.");
            }
        }

        // Method to calculate the total cost of the order
        public double calculateTotalCost() {
            double totalCost = 0;
            for (int i = 0; i < pizzaCount; i++) {
                totalCost += pizzas[i].calcCost();
            }
            return totalCost;
        }

        // Method to get the description of all pizzas in the order
        public String getPizzaDescriptions() {
            StringBuilder descriptions = new StringBuilder();
            for (int i = 0; i < pizzaCount; i++) {
                descriptions.append(pizzas[i].getDescription()).append("\n");
            }
            return descriptions.toString();
        }
    }


