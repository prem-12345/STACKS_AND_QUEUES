package com.bridgelabz.stacksandqueues;

public class StackQueueMain {
    public static void main(String[] args) {

        /**
         * Welcome to Stacks and Queues program
         *
         * @author prem
         * @version 13.0
         * @since 25/08/2021
         */

        Stacks stack = new Stacks();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display();

        System.out.println(stack.peak());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();




    }
}
