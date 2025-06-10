package lab_ass_02;

public class pizza_order_system {
    public static void main(String[] args) {
                // Create pizza objects with different sizes and toppings
        POS_pizza pizza1 = new POS_pizza("small", 2, 1, 1);  // Small pizza with 2 cheese, 1 pepperoni, 1 ham
        POS_pizza pizza2 = new POS_pizza("medium", 3, 2, 0); // Medium pizza with 3 cheese, 2 pepperoni
        POS_pizza pizza3 = new POS_pizza("large", 1, 1, 2);  // Large pizza with 1 cheese, 1 pepperoni, 2 ham

                // Create a PizzaOrder object
        POS_pizza_order  order = new POS_pizza_order ();

                // Add pizzas to the order
                order.addPizza(pizza1);
                order.addPizza(pizza2);
                order.addPizza(pizza3);

                // Display pizza details and total cost
                System.out.println("Pizza Order Details:\n");
                System.out.println(order.getPizzaDescriptions());

                System.out.println("Total cost of the order: $" + order.calculateTotalCost());
            }
        }


