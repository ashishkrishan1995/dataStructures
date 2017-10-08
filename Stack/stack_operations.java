import java.io.*;
import java.util.*;

class Stack {
	private Node top;
	private int size;

	public Stack() {
		this.top = null;
		this.size = 0;
	}

	public void push(int data) {
		Node ptr = new Node(data, null);
		ptr.setLink(top);
		this.top = ptr;
		size++;
	}

	public Node pop() {
		Node ptr = top;
		top = top.getLink();
		size--;
		return ptr;
	}

	public void printStack() {
		Node ptr = top;
		while(ptr!=null) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
		System.out.println();
	}
}

class Node {
	private int data;
	private Node next;

	public Node(int n, Node nxt) {
		this.data = n;
		this.next = nxt;
	}

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
		stack.printStack();
		stack.pop();
		stack.printStack();
	}
}