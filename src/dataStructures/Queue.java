package dataStructures;

public class Queue {
	
	int head;
	int tail;
	int maxSize;
	int[] queue;
	
	public Queue(int maxSize) {
		head = -1;
		tail = -1;
		this.maxSize = maxSize;
		queue = new int[maxSize];
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			throw new IllegalStateException("The queue is full");
		}
		
		if(isEmpty()) {
			head ++;
		}
		tail ++;
		queue[tail] = data;
	}
	
	public boolean isEmpty() {
		if(head == -1 && tail == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(Math.abs(head - tail) >= maxSize) {
			return true;
		}
		return false;
	}

}
