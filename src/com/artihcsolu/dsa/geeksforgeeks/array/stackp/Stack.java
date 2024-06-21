package com.artihcsolu.dsa.geeksforgeeks.array.stackp;

/**
 * The Stack class represents a stack data structure.
 * It provides methods to perform stack operations such as push, pop, peek, and print.
 */
public class Stack {
    static final int MAX = 100;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty() {
        return (top < 0);
    }

    /**
     * Initializes an empty stack.
     */
    Stack() {
        top = -1;
    }

    /**
     * Pushes an item onto the top of the stack.
     *
     * @param item the item to be pushed onto the stack.
     */
    void push(int item) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow!! MAX limit reached");
        } else {
            a[++top] = item;
            System.out.println(item + " Successfully added");
        }
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return the item at the top of the stack.
     */
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            return a[top--];
        }
    }

    /**
     * Returns the item at the top of the stack without removing it.
     *
     * @return the item at the top of the stack.
     */
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            return a[top];
        }
    }

    /**
     * Prints the elements of the stack from top to bottom.
     */
    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

// Driver code
class CallerMain {
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("Top element is :" + s.peek());
		System.out.print("Elements present in stack :");
		s.print();
	}
}
