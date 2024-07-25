package org.example.cs146;

import java.util.Random;

public class SortAlgorithms
{
    public static void doSort(String sortType, Comparable[] a) {
        int length = a.length;
        if(sortType.equals("selectionsort")) {
            for (int i=0; i< length; i++){
                int min = i;
                for (int j = i+1; j< length;j++){
                    if (a[j].compareTo(a[min]) < 0){
                        min =j;

                    }

                }
                Comparable swap = a[i];
                a[i] = a[min];
                a[min]= swap;
            }
        } else if(sortType.equals("insertionsort")) {
             for (int i = 0; i < length; i++) {
                 for (int j = i; j > 0 &&
                         a[j].compareTo(a[j - 1]) < 0;
                      j--) {
                     Comparable swap = a[j];
                     a[j] = a[j - 1];
                     a[j - 1]= swap;
                     }
                }
            }
        }

    public static void print(Comparable[] a) {
        for(int i =0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
    public static Comparable[] randomArray(int n) {
        Comparable[] result = new Comparable[n];
        for(int i = 0; i < n; i++) {
           int randomInt = 1 +  (new Random()).nextInt(10000000);
            result[i] = randomInt;
        }
        return result;
    }
    public static void main(String[] args) {
        int numberOfSteps = 100000;
        Comparable[] a = randomArray(numberOfSteps);
        print(a);
        System.out.println("");

        // Get current time stamp before sorting
        long startTime = System.currentTimeMillis();

        // Sort the array using insertion sort
        doSort("insertionsort", a);

        // Get current time stamp after sorting
        long endTime = System.currentTimeMillis();

        // Calculate execution time in seconds
        double executionTime = (endTime - startTime) / 1000.0;

        System.out.println("After sorted");

        print(a);
        System.out.println("Execution time: " + executionTime + " seconds");
        System.out.println("average = "+executionTime/Math.pow(numberOfSteps, 2));
    }



}
