package Lab_assignment_03;

public class Scenario_02 {
        public static void main(String[] args) {
                String[] sampleNames = {"Ali", "Ahmad", "Laiba", "Sidra"};
                NameCollection_s2b nameCollection = new NameCollection_s2b(sampleNames);

                for (int i = 0; nameCollection.hasNext(i); i++) {
                        System.out.println(nameCollection.getNext(i));

                }
        }
}
