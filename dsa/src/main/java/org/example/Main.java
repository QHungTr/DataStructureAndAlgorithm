package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is DSA learning");
        NodeManagement nodeManagement = new NodeManagement();
        nodeManagement.createBinaryTree();
        //nodeManagement.traverse();
        //nodeManagement.removeNode("H");
        Node node1 = new Node();
        node1.setContent("1");
        Node node2 = node1;
        node1=null;
        System.out.println();
        nodeManagement.traverse();
        nodeManagement.removeNode("L");
        System.out.println("after: ");
        nodeManagement.traverse();
        System.out.println(" ");
        StackManagement sm = new StackManagement();
//        String reverseString = sm.reversedString();
//        System.out.println(reverseString);
        System.out.println("Input a String:");
        String input = (new Scanner(System.in)).nextLine();
        System.out.println(sm.isValidExpression(input));


    }

}