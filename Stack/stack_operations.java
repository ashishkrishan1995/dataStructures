import java.io.*;
import java.util.*;

// stack class which contains a top node which holds the stacks starting position and the size of the stack
class Stack {
	private Node top;
	private int size;

	// constructor for stack class
	public Stack() {
		this.top = null;
		this.size = 0;
	}

	// add a new element to the stack
	public void push(int data) {
		Node ptr = new Node(data, null);
		ptr.setLink(top);
		this.top = ptr;
		size++;
	}

	// remove the element from the top of the stack
	public Node pop() {
		Node ptr = top;
		top = top.getLink();
		size--;
		return ptr;
	}

	// print the contents of the stack
	public void printStack() {
		Node ptr = top;
		while(ptr!=null) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
		System.out.println();
	}
}

// Node class which contains the next node and the data in the current node
class Node {
	private int data;
	private Node next;

	// constructor with data and next node
	public Node(int n, Node nxt) {
		this.data = n;
		this.next = nxt;
	}

	// Getters and setters for node class
	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setLink(Node n) {
		this.next = n;
	}

	public Node getLink() {
		return this.next;
	}
}

public class stack_operations {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(10);
		stack.push(1);
		// push 100, 10, 1 to the stack
		stack.printStack();
		// print the stack
		stack.pop();
		// pop the top element
		stack.printStack();
		// finally print the stack
	}
}