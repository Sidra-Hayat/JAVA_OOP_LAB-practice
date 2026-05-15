package lab10;
import java.util.ArrayList;

    public class task2_MyMathClass<T extends Number> {

        public double standardDeviation(ArrayList<T> data) {
            if (data == null || data.isEmpty()) {
                throw new IllegalArgumentException("Data list cannot be null or empty.");
            }

            int n = data.size();
            double sum = 0.0;

            for (T num : data) {
                sum += num.doubleValue();
            }

            double mean = sum / n;

            double squaredDiffSum = 0.0;
            for (T num : data) {
                double diff = num.doubleValue() - mean;
                squaredDiffSum += diff * diff;
            }

            return Math.sqrt(squaredDiffSum / n); // Population standard deviation
        }


}
