package org.example;

import java.util.Scanner;
import java.util.Stack;
import java.util.HashSet;
import java.util.Set;

public class StackManagement {
    private Stack<String> stack = new Stack<>();

    private Scanner sn = new Scanner(System.in);
    private boolean isMatchExpressionCharacter(String a, String b) {
        // Normalizes the input strings to a consistent case to simplify comparison.
        String lowA = a.toLowerCase();
        String lowB = b.toLowerCase();

        // Checks if either string is an opening bracket and the other is the corresponding closing bracket.
        return (lowA.equals("(") && lowB.equals(")")) ||
                (lowA.equals(")") && lowB.equals("(")) ||
                (lowA.equals("{") && lowB.equals("}")) ||
                (lowA.equals("}") && lowB.equals("{")) ||
                (lowA.equals("[") && lowB.equals("]")) ||
                (lowA.equals("]") && lowB.equals("["));
    }

    public String reversedString(){
        System.out.println("Input a String:");
        String input = this.sn.nextLine();
        for(int i = 0; i < input.length(); i++){
            String letter = Character.toString(input.charAt(i));
            stack.push(letter);
        }
        String output = "";
        while (!stack.isEmpty()) {
            String letter = stack.pop();
            //output = output + letter;
            output = String.format("%s%s", output, letter);
        }

        return output;
    }
    public boolean isValidExpression(String input){

        for(int i = 0; i < input.length(); i++){
            String letter = Character.toString(input.charAt(i));

            if (Set.of(
                    "{","}","[","]", "(", ")"
            ).contains(letter)){
                //kiem tra xem co hop nhau ko

                if (isMatchExpressionCharacter(letter,stack.isEmpty() ? "" : stack.peek())) {
                    stack.pop();
                }else{
                    stack.push(letter);
                }

            }

        }
        return stack.isEmpty();
    }
}
