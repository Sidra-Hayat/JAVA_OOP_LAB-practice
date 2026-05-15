package lab11;
import java.io.Serializable;
public class task1_Person  implements Serializable {



        private String name;

        public task1_Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }


