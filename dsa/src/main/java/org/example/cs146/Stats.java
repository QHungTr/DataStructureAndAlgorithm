package org.example.cs146;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//C:\Users\hungz\.jdks\openjdk-21.0.2\bin\java.exe
public class Stats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Read integers from standard input
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        // Compute mean, variance, and standard deviation
        double mean = calculateMean(numbers);
        double variance = calculateVariance(numbers, mean);
        double standardDeviation = Math.sqrt(variance);

        // Print results up to 3 decimal places
        System.out.printf("Mean: %.3f\n", mean);
        System.out.printf("Variance: %.3f\n", variance);
        System.out.printf("Standard Deviation: %.3f\n", standardDeviation);
    }

    private static double calculateMean(List<Integer> numbers) {
        double sum = 0.0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    private static double calculateVariance(List<Integer> numbers, double mean) {
        double sum = 0.0;
        for (int num : numbers) {
            sum += Math.pow(num - mean, 2); //
        }
        return sum / numbers.size();
    }
}