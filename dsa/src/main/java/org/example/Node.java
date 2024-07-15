package org.example;

public class Node {
    private Node left;
    private  Node right;
    private Node parent;

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

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
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
