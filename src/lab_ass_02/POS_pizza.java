package lab_ass_02;

public class POS_pizza {

        private String size;  // Size of the pizza (small, medium, large)
        private int cheeseToppings; // Number of cheese toppings
        private int pepperoniToppings; // Number of pepperoni toppings
        private int hamToppings; // Number of ham toppings

        // Constructor to initialize the pizza attributes
        public POS_pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
            this.size = size;
            this.cheeseToppings = cheeseToppings;
            this.pepperoniToppings = pepperoniToppings;
            this.hamToppings = hamToppings;
        }

        // Getter and Setter methods
        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getCheeseToppings() {
            return cheeseToppings;
        }

        public void setCheeseToppings(int cheeseToppings) {this.cheeseToppings = cheeseToppings;}
    public int getPepperoniToppings() {return pepperoniToppings;}
    public void setPepperoniToppings(int pepperoniToppings) {this.pepperoniToppings = pepperoniToppings;}
    public int getHamToppings() {return hamToppings;}
    public void setHamToppings(int hamToppings) {this.hamToppings = hamToppings;}
    // Method to calculate the total cost of the pizza
        public double calcCost() {
            double baseCost = 0;
            // Base cost based on the size of the pizza
            if (size.equals("small")) {baseCost = 10;
            } else if (size.equals("medium")) {baseCost = 12;
            } else if (size.equals("large")) {baseCost = 14;}
            // Add cost for toppings ($2 per topping)
            int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
            return baseCost + totalToppings * 2;
        }
        public String getDescription() {
            return "Pizza size: " + size + ", Cheese Toppings: " + cheeseToppings + ", Pepperoni Toppings: "
                    + pepperoniToppings + ", Ham Toppings: " + hamToppings;
        }
    }


