package com.artihcsolu.dsa.geeksforgeeks.linkedlist.singly.others;

public class CountOccurrences {

	Node head; // head of list

	/* Linked list Node*/
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	int count(int element) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (current.data == element) {
				count++;
			}
			current =  current.next;
		}
		return count;
	}

	public static void main(String args[]) {
		CountOccurrences llist = new CountOccurrences();
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(3);
		llist.push(1);
		System.out.println("Count of 1 is " + llist.count(1));
	}

}
