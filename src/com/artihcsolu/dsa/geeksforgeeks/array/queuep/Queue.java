package com.artihcsolu.dsa.geeksforgeeks.array.queuep;

/**
 * A simple implementation of a queue data structure.
 */
class Queue {

    static final int MAX = 1000;
    int front, rear;
    /**
     * The array used to store elements in the queue.
     */
    int[] a = new int[MAX];

    Queue() {
        front = 0;
        rear = 0;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty() {
        return front == rear;
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full, false otherwise.
     */
    boolean isFull() {
        return rear == MAX;
    }

    /**
     * Adds an element to the rear of the queue.
     *
     * @param data the element to be added.
     */
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow!!");
        } else {
            a[rear++] = data;
            System.out.println(data + " Successfully added");
        }
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element at the front of the queue.
     */
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!!");
            return 0;
        } else {
            return a[front++];
        }
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return the element at the front of the queue.
     */
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return 0;
        } else {
            return a[front];
        }
    }

    /**
     * Prints the elements of the queue.
     */
    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

class CallerMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.print();
        System.out.println("\nDequeued: " + queue.dequeue());
        System.out.println("Peeked: " + queue.peek());
        queue.print();
    }
}
