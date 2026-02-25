package object_oriented_analysis_design_coursera;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

/*
 * Statistics for OOAD Course 1 Project 1
 * Your Md. Alamin
 * 26 February, 2026 GMT6+
 */

public class Generator {


    // main for Generator
    public static void main(String[] args) {
        Generator g = new Generator();
        g.execute();
    }

    // creates an ArrayList of n random numbers from 1 of the 3 selected
    // randomNumberGenerators
    ArrayList<Double> populate(int n, int randNumGen) {

        // your code here
        ArrayList<Double> values = new ArrayList<>();

        // examples of talking to the random number generators
        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            double number = 0.0;

            if (randNumGen == 1) {
                number = rand.nextDouble();
            }
            else if (randNumGen == 2) {
                number = Math.random();
            }
            else if (randNumGen == 3) {
                number = ThreadLocalRandom.current().nextDouble();
            }

            values.add(number);
        }

        return values; // you need to return the ArrayList of n random values
    }

    // calculates mean, sample standard deviation, minimum, and maximum
    // from the randomValues provided, and returns an ArrayList with
    // five results [n, mean, stddev, min, max]
    ArrayList<Double> statistics(ArrayList<Double> randomValues) {
        // your code here
        int n = randomValues.size();
        double sum = 0.0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double value : randomValues) {
            sum += value;

            if (value < min) min = value;
            if (value > max) max = value;
        }

        double mean = sum / n;

        // Sample Standard Deviation
        double varianceSum = 0.0;
        for (double value : randomValues) {
            varianceSum += Math.pow(value - mean, 2);
        }

        double stddev = Math.sqrt(varianceSum / (n - 1));

        ArrayList<Double> results = new ArrayList<>();
        results.add((double) n);
        results.add(mean);
        results.add(stddev);
        results.add(min);
        results.add(max);

        return results;
    }

    // displays the ArrayList of five result values in a tabular fashion in the
    // system console (see output example)
    void display(ArrayList<Double> results, boolean headerOn) {
        // your code here
        if (headerOn) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
                    "n", "Mean", "StdDev", "Min", "Max");
        }

        System.out.printf("%-10.0f %-10.4f %-10.4f %-10.4f %-10.4f\n",
                results.get(0),
                results.get(1),
                results.get(2),
                results.get(3),
                results.get(4));
        // see reading for output example
    }

    // calls populate, statistics, and display methods for each combination of n and
    // randomNumberGenerator â€“ a total of 9 results
    void execute() {
        String[] rm = { "Java.util.Random", "Math.random", "ThreadLocalRandom" };
        // select the random number generator
        for (int k = 0; k < 3; k++) {
            // select n
            for (int i = 1; i < 4; i++) {
                int n = (int) Math.pow(10.0, (double) i);
                ArrayList<Double> rv = populate(n, k);    // calls your populate method
                ArrayList<Double> res = statistics(rv);   // calls your statistics method
                boolean headerOn = false;
                if (i == 1) {
                    headerOn = true;
                    System.out.println(rm[k]);
                }
                display(res, headerOn); // calls your display method
            }
        }
    }
}
