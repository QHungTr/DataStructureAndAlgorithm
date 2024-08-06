package org.example.cs146;

public class DoubleLinkedList {
    private StudentNode head;
    public void addNode(Student student) {
        //create a new node with data
        StudentNode studentNode = new StudentNode();
        studentNode.setData(student);
        if(head == null) {//first node
            head = studentNode;
            studentNode.setNext(null);
            studentNode.setPrevious(null);
        } else {
            StudentNode current = head;
            StudentNode last = null;
            while (true) {
                if(current.getNext() == null) {
                    last = current;
                    break;
                } else {
                    current = current.getNext();
                }
            }
            last.setNext(studentNode);
            studentNode.setNext(null);
            studentNode.setPrevious(last);
        }
    }
    public StudentNode get(int i) {
        StudentNode current = head;
        int index = 0;
        while (true) {
            if(index == i) {
                return current;
            } else {
                index++;
                current = current.getNext();
                if(index == i) {
                    return current;
                }
                if(current.getNext() == null) {
                    //last element
                    break;
                }
            }

        }
        return null;
    }
    public int length() {
        StudentNode current = head;
        int size = current != null ? 1 : 0;
        while (true) {
            size++;
            current = current.getNext();
            if(current.getNext() == null) {
                break;
            }
        }
        return size;
    }
    public void print() {
        StudentNode current = head;
        while (true) {
            System.out.println(current.getData().toString());
            current = current.getNext();
            if(current.getNext() == null) {
                break;
            }
        }
    }

    public StudentNode getHead() {
        return head;
    }

    public void setHead(StudentNode head) {
        this.head = head;
    }
}
