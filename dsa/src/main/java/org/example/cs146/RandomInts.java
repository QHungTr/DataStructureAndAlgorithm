package org.example.cs146;
import java.util.Random;

public class RandomInts {
    public static void main(String[] args) {
        //cd D:\DataStructureAndAlgorithm\dsa\src\main\java\org\example\cs146
        //C:\Users\hungz\.jdks\openjdk-21.0.2\bin\java.exe
        if (args.length != 3) {
            System.err.println("Usage: java RandomInts n a b");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (a > b) {
            System.err.println("Invalid range: a must be less than or equal to b");
            return;
        }

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int randomNum = a + rand.nextInt(b - a + 1);
            System.out.println(randomNum);
        }
    }
}

