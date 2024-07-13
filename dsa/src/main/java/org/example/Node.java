package org.example;

public class Node {
    private Node left;
    private  Node right;

    private String content;
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
   //all arguments constructor
    public Node (Node left, Node right, String content){
        this.left = left;
        this.right= right;
        this.content= content;
    }
    //no argument constructor
    public Node (){
        this.left = null;
        this.right  = null;
        this.content = "";
    }

    @Override
    public String toString() {
        return content;
    }


}
