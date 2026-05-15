package lab10;

 import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        task2_MyMathClass<Integer> intMath = new task2_MyMathClass<>();
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        double stdDevInt = intMath.standardDeviation(intList);
        System.out.println("Standard Deviation (Integer): " + stdDevInt);

        task2_MyMathClass<Double> doubleMath = new task2_MyMathClass<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(12.5);
        doubleList.add(15.8);
        doubleList.add(9.3);
        doubleList.add(14.6);

        double stdDevDouble = doubleMath.standardDeviation(doubleList);
        System.out.println("Standard Deviation (Double): " + stdDevDouble);

        // Uncommenting the following lines will cause a compile-time error
        // because String is not a subclass of Number


//        task1_MyMathClass<String> stringMath = new task1_MyMathClass<>();
//        ArrayList<String> strList = new ArrayList<>();
//        strList.add("a");
//        strList.add("b");
//        double stdDevString = stringMath.standardDeviation(strList); // Compile-time error
//
    }
}

