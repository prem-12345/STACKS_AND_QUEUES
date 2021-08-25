package com.bridgelabz.stacksandqueues;

public class Stacks {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * UC1 Ability to create stack of 56,30 and 70.
     *
     * @author prem
     * @version 13.1
     * @since 25/08/2021
     */

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("Element Push: " + top.data);
    }

    /**
     * UC2 Ability to peak and pop from the stack till its empty.
     *
     * @author prem
     * @version 13.2
     * @since 25/08/2021
     */

    public int peak() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return top.data;
    }

    public int pop() {
        int poped;

        if (isEmpty()) {
            System.out.println("Empty Stack.");
            return -1;
        }
        poped = top.data;
        top = top.next;

        return poped;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


}
