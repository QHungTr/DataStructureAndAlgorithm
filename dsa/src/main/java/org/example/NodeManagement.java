package org.example;

public class NodeManagement {
    private Node rootNode;

    public void createBinaryTree() {

        Node nodeB = new Node(null, null, "B");
        Node nodeD = new Node(null, null, "D");
        Node nodeC = new Node(nodeB, nodeD, "C");
        Node nodeA = new Node(null, nodeC, "A");
        Node nodeF = new Node(nodeA, null, "F");


        Node nodeP = new Node(null, null, "P");
        Node nodeT = new Node(null, null, "T");
        Node nodeN = new Node(null, nodeP, "N");
        Node nodeR = new Node(nodeN, nodeT, "R");
        Node nodeJ = new Node(null, null, "J");
        Node nodeL = new Node(nodeJ, nodeR, "L");
        this.rootNode = new Node(nodeF, nodeL, "H");

    }


    private void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.toString()+", ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }
    private void postorderTraversal(Node node){
        if (node != null) {
            postorderTraversal(node.getLeft());//recursive = de quy
            postorderTraversal(node.getRight());
            System.out.print(node.toString() + ", ");
        }
    }
    private void inorderTraversal(Node node){
        if (node != null) {
            inorderTraversal(node.getLeft());//recursive = de quy
            System.out.print(node.toString() + ", ");
            inorderTraversal(node.getRight());

        }
    }
    public void traverse() {
        //this.createBinaryTree();
        //preorderTraversal(this.rootNode);
        //postorderTraversal(this.rootNode);
        inorderTraversal(this.rootNode);

    }
}
