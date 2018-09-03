package dataStructures;

public class Stack {
	
	public int maxSize;
	public int top;
	public int[] stackArray;
	
	public Stack(int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		stackArray = new int[maxSize];
	}
	
	public void push(int n) {
		if(this.isFull()) {
			throw new IllegalStateException("The stack is full");
		}
		top ++;
		stackArray[top] = n;
	}
	
	public int peek() {
		if(this.isEmpty()) {
			throw new IllegalStateException("The stack is empty");
		}
		return stackArray[top];
	}
	
	public int pop() {
		if(this.isEmpty()) {
			throw new IllegalStateException("The stack is empty");
		}
		int data = stackArray[top];
		stackArray[top] = 0;
		top --;
		return data;
	}
	
	public boolean isFull() {
		if(top == maxSize-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String s = "[";
		for(int i = 0; i < stackArray.length-1; i++) {
			s += stackArray[i] + ", ";
		}
		s += stackArray[stackArray.length-1] + "]";
		return s + " top: " + top;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(1);
		System.out.println(s.peek());
		s.push(2);
		s.push(2);
		System.out.println(s.isFull());
		

	}
	

}
