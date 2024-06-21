package com.artihcsolu.dsa.geeksforgeeks.linkedlist.singly.queuep;
// Queue is a linear data structure that follows the FIFO (First In First Out) principle.
// The elements are inserted at the rear end and removed from the front end. 
// The insert operation is called enqueue and the remove operation is called dequeue.

/**
    * Constructs a new QueueNode with the specified data.
    * 
    * @param data the data to be stored in the node
    */
class QueueNode{
    int data;
    QueueNode next;
    QueueNode(int data){
        this.data = data;
        this.next = null;
    }   
}

/**
 * Implementation of a queue using a linked list.
 */
class QueueWithLinkedList{
    QueueNode front, rear;

    /**
     * Constructs an empty queue.
     */
    QueueWithLinkedList(){
        this.front = this.rear = null;
    }

    /**
     * Adds an element to the rear of the queue.
     * @param data the data to be added
     */
    void enqueue(int data){
        QueueNode temp = new QueueNode(data);
        if(this.rear == null){
            this.front = this.rear = temp;
            System.out.println(data + " Node Successfully added");
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
        System.out.println(data + " Successfully added");
    }

    /**
     * Removes the element from the front of the queue.
     */
    void dequeue(){
        if(this.front == null){
            System.out.println("Queue Underflow!!");
            return;
        }
        System.out.println(this.front.data + " Successfully removed");
        this.front = this.front.next;
        if(this.front == null){
            this.rear = null;
        }
    }

    /**
     * Prints the elements of the queue.
     */
    void printQueue(){
        QueueNode temp = this.front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        QueueWithLinkedList queue = new QueueWithLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
    }
}
