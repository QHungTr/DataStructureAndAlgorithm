package org.example.cs146;

import java.util.Arrays;
import java.util.Random;

public class SortAlgorithms
{
    public void doSort(SortType sortType, Comparable[] a) {
        int length = a.length;
        if(sortType == SortType.SELECTION_SORT) {
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
        } else if(sortType == SortType.INSERTION_SORT) {
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
        else if(sortType == SortType.QUICK_SORT) {
            quickSort(a, 0, length - 1);
        }  else if(sortType == SortType.JAVA_SORT) {
            Arrays.sort(a);
        }
    }
    private void quickSort(Comparable[] a, int low, int high) {
        if (low < high) {
            Comparable pivot = a[high];
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (a[j].compareTo(pivot) < 0) {
                    i++;
                    Comparable swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
            Comparable swap = a[i + 1];
            a[i + 1] = a[high];
            a[high] = swap;
            int pi = i + 1;
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
    public void print(Comparable[] a) {
        for(int i =0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
    public Comparable[] randomArray(int n) {
        Comparable[] result = new Comparable[n];
        for(int i = 0; i < n; i++) {
           int randomInt = 1 +  (new Random()).nextInt(10000000);
            result[i] = randomInt;
        }
        return result;
    }
    public double calculateTime(SortType sortType, int numberOfSamples) {
        Comparable[] a = randomArray(numberOfSamples);
        long startTime = System.currentTimeMillis();
        doSort(sortType, a);
        long endTime = System.currentTimeMillis();
        double executionTime = (endTime - startTime) / 1000.0;
        return executionTime;
    }
    public static void main(String[] args) {

//        int numberOfSteps = 100000;
//        Comparable[] a = randomArray(numberOfSteps);
//        print(a);
//        System.out.println("");
//
//        // Get current time stamp before sorting
//        long startTime = System.currentTimeMillis();
//
//        // Sort the array using insertion sort
//        doSort("insertionsort", a);
//
//        // Get current time stamp after sorting
//        long endTime = System.currentTimeMillis();
//
//        // Calculate execution time in seconds
//        double executionTime = (endTime - startTime) / 1000.0;
//
//        System.out.println("After sorted");
//
//        print(a);
//        System.out.println("Execution time: " + executionTime + " seconds");
//        System.out.println("average = "+executionTime/Math.pow(numberOfSteps, 2));
    }



}
