package lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task4_DivingScoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        System.out.print("Enter the degree of difficulty (1.2 to 3.8): ");
        double degreeOfDifficulty = scanner.nextDouble();

        // Validate degree of difficulty
        while (degreeOfDifficulty < 1.2 || degreeOfDifficulty > 3.8) {
            System.out.print("Invalid input. Enter a value between 1.2 and 3.8: ");
            degreeOfDifficulty = scanner.nextDouble();
        }

        // Input 7 scores
        System.out.println("Enter the 7 judges' scores (each between 0.0 and 10.0):");
        int count = 0;
        while (count < 7) {
            double score = scanner.nextDouble();
            if (score >= 0.0 && score <= 10.0) {
                scores.add(score);
                count++;
            } else {
                System.out.println("Invalid score. Enter a value between 0.0 and 10.0:");
            }
        }

        // Sort scores to remove highest and lowest
        Collections.sort(scores);
        scores.remove(0); // Remove lowest
        scores.remove(scores.size() - 1); // Remove highest

        // Sum remaining scores
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }

        // Apply formula
        double totalScore = sum * degreeOfDifficulty * 0.6;

        // Output result
        System.out.printf("The diver's final score is: %.2f%n", totalScore);
    }
}

