package org.example.cs146;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Search {
    public void exercise1() {
        List<Integer> list = List.of(5, 3, 8, 4, 2, 7, 1, 10);
           int[] list3 = {5, 3, 8, 4, 2, 7, 1, 10};
            List<Float> list2 = new ArrayList<>();
//        list2.add(4.0f);

        for (int i= 0; i< list3.length;i ++){
            if (list3[i]==7){
                System.out.println("Vị trí của 7 trong danh sách là "+i);
            }
        }

    }
    public int binarySearch(int[] list, int value) {
        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            //System.out.println("Left: "+left+", right: "+right+", middle: "+middle);
            // Check if the value is present at mid
            if (list[middle] == value) {
                //System.out.println("Found "+value+" at "+middle);
                return middle;
            }

            // If the value is greater, ignore the left half
            if (list[middle] < value) {
                left = middle + 1;
            } else {
                // If the value is smaller, ignore the right half
                right = middle - 1;
            }
        }

        // If the value is not present in the array
        //System.out.println("Cannot find value : "+value);
        return -1;
    }
    public void exercise2() {
        // Create an array of 10,000 random elements with values from 1 to 200,000
        int[] list = new int[200_000_000];
        Random rand = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(2000) + 1;
        }

        // Sort the array to apply binary search
        //Arrays.sort(list);

        int valueToFind = 6;

        // Record the start time
        long startTime = System.currentTimeMillis();

        // Perform binary search
        int result = binarySearch(list, valueToFind);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the time taken in milliseconds
        double duration = (endTime - startTime);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        System.out.println("Time taken: " + duration + " seconds");
    }

    public static void main(String[] args) {
        Search search = new Search();
        //search.exercise1();
        search.exercise2();
    }
}
