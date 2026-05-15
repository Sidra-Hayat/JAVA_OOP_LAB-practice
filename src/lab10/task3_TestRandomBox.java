package lab10;

    public class task3_TestRandomBox {
        public static void main(String[] args) {
            // Box of Strings
            task3_RandomBox<String> nameBox = new task3_RandomBox<>();
            nameBox.add("Alice");
            nameBox.add("Bob");
            nameBox.add("Charlie");

            System.out.println("Drawing a name from the box: " + nameBox.drawItem());

            // Box of Integers
           task3_RandomBox<Integer> lotteryBox = new task3_RandomBox<>();
            lotteryBox.add(5);
            lotteryBox.add(12);
            lotteryBox.add(23);
            lotteryBox.add(37);

            System.out.println("Drawing a lottery number: " + lotteryBox.drawItem());

            // Testing empty box
            task3_RandomBox<Double> emptyBox = new task3_RandomBox<>();
            System.out.println("Drawing from empty box: " + emptyBox.drawItem());
        }
    }


