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
		top --;
		return stackArray[top + 1];
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
	
	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(1);
		System.out.println(s.peek());
		s.push(2);
		s.push(2);
		System.out.println(s.isFull());
		

	}
	

}
