package com.artihcsolu.dsa.geeksforgeeks.linkedlist.singly.stackp;

public class StackWithLinkedList {
    StackNode root;

	static class StackNode {
    int data;
    StackNode next;

    StackNode (int data) {
        this.data = data;
    }
    }

    public boolean isEmpty(){
        return root == null? true : false;
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode tempNode = root;
            root = newNode;
            newNode.next = tempNode;            
        }
        System.out.println(data + " Successfully added");
    }

    public int pop(){
        if (root == null) {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            int popped = root.data;
            root = root.next;
            return popped;
        }
    }

    public int peek(){
        if (root == null) {
            System.out.println("Stack is empty!!");
            return 0;
        } else {
            return root.data;
        }
    }

    public static void main(String[] args) {
        StackWithLinkedList sll = new StackWithLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() 
                           + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek());
    }
}
