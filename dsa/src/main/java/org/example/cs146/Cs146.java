package org.example.cs146;
import org.example.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Cs146 {
    public static int mystery(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x += a[i] * a[i];

        }
        return x;
    }

    public static int[][] mystery2(int n, int k) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i == j ? k : 0;
                System.out.print(a[i][j] + ", ");
                if (j == n - 1) {
                    System.out.println();
                }
            }

        }
        return a;
    }

    public static int mystery3(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (a == 0) {
            return mystery3(b - 1, a);

        }
        return b + mystery3(b, a - 1);
    }

    public static void calculateCircle() {
        double r = 5.0;
        double c = 2 * Math.PI * r;
        double a = Math.PI * r * r;
        System.out.printf(" radius = %.2f , circumference = %.2f , area = %.2f", r, c, a);
    }
    public static void bubbleSort() {
        int[] myArray = {1, 5, 7, 4, 3, 2, 6, 8, 9};
        int length = myArray.length;
        System.out.println("Before sort");
        printArray(myArray);
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                System.out.println(String.format("i = %d, j = %d", i, j));
                if(myArray[i] < myArray[j]) {
                    //swap 2 numbers
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("After sort");
        printArray(myArray);
    }
    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+ ", ");
        }
    }
    public static void findMaxOccurenceInArray2(LinkedList linkedList) {
        Map<String, Integer> frequency = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        linkedList.addNode(new Student("m1@gmail.com", "John", "112211122"));
        linkedList.addNode(new Student("m2@gmail.com", "Huan", "112211122"));
        linkedList.addNode(new Student("m3@gmail.com", "Kang", "112211122"));
        linkedList.addNode(new Student("m4@gmail.com", "John", "112211122"));
        linkedList.addNode(new Student("m5@gmail.com", "Kang", "11221114"));
        linkedList.addNode(new Student("m6@gmail.com", "John", "112211122"));
        linkedList.addNode(new Student("m7@gmail.com", "Hung", "112211122"));
        linkedList.addNode(new Student("m5@gmail.com", "Kang", "11221114"));
        linkedList.addNode(new Student("m5@gmail.com", "Kang", "11221114"));
        linkedList.addNode(new Student("m5@gmail.com", "Kang", "11221114"));
        //linkedList.print();
        //System.out.println(linkedList.length());
        for(int i = 0; i < linkedList.length(); i++) {
            String name = linkedList.get(i).getData().getName();
            //System.out.println(key);
            if(frequency.containsKey(name)) {
                frequency.put(name, frequency.get(name) + 1);
            } else {
                frequency.put(name, 1);
            }
            if(frequency.get(name) > maxValue) {
                maxValue = frequency.get(name);
            }
        }
        //print hash map
        int finalMaxValue = maxValue;
        frequency.forEach((name, amount) -> {
            if(amount == finalMaxValue) {
                System.out.println(String.format("Occurence of %s is %d", name, amount));
            }
        });

    }
    public static void findMaxOccurenceInArray(int[] myArray) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0 ; i < myArray.length; i++) {
            int key = myArray[i];
            if(frequency.containsKey(key)) {
                frequency.put(key, frequency.get(key) + 1);
            } else {
                frequency.put(key, 1);
            }

            if(frequency.get(key) > maxValue) {
                maxValue = frequency.get(key);
            }

            //maxValue = (frequency.get(key) > maxValue) ? frequency.get(key) : maxValue;

        }
        //print hash map
        int finalMaxValue = maxValue;
        frequency.forEach(new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer key, Integer value) {
                if(value == finalMaxValue) {
                    System.out.println(String.format("Occurence of %d is %d", key, value));
                }
            }
        });


        /*
        frequency.forEach((key, value) -> {
            if(value == finalMaxValue) {
                System.out.println(String.format("Occurence of %d is %d", key, value));
            }
        });
         */
    }

}