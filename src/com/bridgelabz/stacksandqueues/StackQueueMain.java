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

        Queues queue = new Queues();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.display();

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.display();



    }
}
