package lab10;


    import java.util.ArrayList;
import java.util.Random;

    public class task3_RandomBox<T> {
        private ArrayList<T> items;
        private Random rand;

        public task3_RandomBox() {
            items = new ArrayList<>();
            rand = new Random();
        }

        public void add(T item) {
            items.add(item);
        }

        public boolean isEmpty() {
            return items.isEmpty();
        }

        public T drawItem() {
            if (isEmpty()) {
                return null;
            }
            int index = rand.nextInt(items.size());
            return items.get(index);
        }
    }


