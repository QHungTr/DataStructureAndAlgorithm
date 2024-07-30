package org.example.cs146;

public class StudentNode {
    private Student data;
    private
    StudentNode next;

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }
}
