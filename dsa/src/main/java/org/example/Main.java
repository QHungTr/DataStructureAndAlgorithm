package org.example;

import org.example.cs146.SortAlgorithms;
import org.example.cs146.SortType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("This is DSA learning");
//        NodeManagement nodeManagement = new NodeManagement();
//        nodeManagement.createBinaryTree();
//        //nodeManagement.traverse();
//        //nodeManagement.removeNode("H");
//        Node node1 = new Node();
//        node1.setContent("1");
//        Node node2 = node1;
//        node1=null;
//        System.out.println();
//        nodeManagement.traverse();
//        nodeManagement.removeNode("L");
//        System.out.println("after: ");
//        nodeManagement.traverse();
//        System.out.println(" ");
//        StackManagement sm = new StackManagement();
//        String reverseString = sm.reversedString();
//        System.out.println(reverseString);
//        System.out.println("Input a String:");
//        String input = (new Scanner(System.in)).nextLine();
//        System.out.println(sm.isValidExpression(input));
//        int[] a = {4,2,7,3};
//        System.out.println(Cs146.mystery(a));
//        //ternary operator
//        int y = 10;
//        int x = y < 10 ? 8 : 2;
//        System.out.println("x = "+x);
        //System.out.println(Cs146.mystery3(200,300));
          //RandomNew randomNew = new RandomNew();
          //randomNew.saveToFile("JavaA.txt");
        SortAlgorithms sortAlgorithms = new SortAlgorithms();
        int numberOfSamples = 100_000_000;
        //System.out.println("Time: "+sortAlgorithms.calculateTime(SortType.SELECTION_SORT, numberOfSamples));
        //System.out.println("Time: "+sortAlgorithms.calculateTime(SortType.INSERTION_SORT, numberOfSamples));
        //System.out.println("Time: "+sortAlgorithms.calculateTime(SortType.QUICK_SORT, numberOfSamples));
        System.out.println("Time: "+sortAlgorithms.calculateTime(SortType.JAVA_SORT, numberOfSamples));

    }

}