package org.example;

import java.util.Stack;

public class NodeManagement {
    private Node rootNode;

    public void createBinaryTree() {

        Node nodeB = new Node(null, null, "B");
        Node nodeD = new Node(null, null, "D");

        Node nodeC = new Node(nodeB, nodeD, "C");
        nodeB.setParent(nodeC);
        Node nodeA = new Node(null, nodeC, "A");
        nodeC.setParent(nodeA);
        Node nodeF = new Node(nodeA, null, "F");
        nodeA.setParent(nodeF);

        Node nodeP = new Node(null, null, "P");
        Node nodeT = new Node(null, null, "T");
        Node nodeN = new Node(null, nodeP, "N");
        nodeP.setParent(nodeN);
        Node nodeR = new Node(nodeN, nodeT, "R");
        nodeN.setParent(nodeR);
        nodeT.setParent(nodeN);
        Node nodeJ = new Node(null, null, "J");
        Node nodeL = new Node(nodeJ, nodeR, "L");
        nodeJ.setParent(nodeL);
        nodeR.setParent(nodeL);
        this.rootNode = new Node(nodeF, nodeL, "H");
        nodeF.setParent(this.rootNode);
        nodeL.setParent(this.rootNode);
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
            if(last printed item ) {
                System.out.print(node.toString() + " ");
            } else {
                System.out.print(node.toString() + ", ");
            }
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
    private void deleteNode(Node current, String content) {
        if(current != null) {
            if(current.getContent().equalsIgnoreCase(content)) {
                Node parent = current.getParent();
                if(parent != null) {
                    if(current == parent.getLeft()) {
                        parent.setLeft(null);
                    }
                    if (current == parent.getRight()){
                        parent.setRight(null);
                    }
                }
                current.setParent(null);
                current.setRight(null);
                current.setLeft(null);
            }
        }
    }

    public void removeNode(String content) {
        Stack<Node> stack = new Stack<>();
        Node current = this.rootNode;
        deleteNode(current, content);



        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
                deleteNode(current, content);
            }

            // Current must be null at this point
            current = stack.pop();
            deleteNode(current, content);
            //System.out.print(current.getContent() + "...");

            // Visit the right subtree
            current = current.getRight();
            deleteNode(current, content);
        }
    }


/*
    private Node removeNodeRecursive(Node current, String content) {
        if (current == null) {
            return null;
        }

        if (content.equals(current.getContent())) {
            // Node to be deleted found


            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }


            if (current.getLeft() == null) {
                return current.getRight();
            }
            if (current.getRight() == null) {
                return current.getLeft();
            }

            String smallestValue = findSmallestValue(current.getRight());
            current.setContent(smallestValue);
            current.setRight(removeNodeRecursive(current.getRight(), smallestValue));
            return current;

        }

        if (content.compareTo(current.getContent()) < 0) {
            current.setLeft(removeNodeRecursive(current.getLeft(), content));
            return current;
        }

        current.setRight(removeNodeRecursive(current.getRight(), content));
        return current;
    }

    private String findSmallestValue(Node root) {
        return root.getLeft() == null ? root.getContent() : findSmallestValue(root.getLeft());
    }
    */

}


