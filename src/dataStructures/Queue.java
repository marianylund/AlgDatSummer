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
		if(tail == maxSize-1) {
			tail = 0;
		} else {
			tail ++;			
		}
		queue[tail] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("The queue is empty");
		}
		int data = queue[head];
		queue[head]=0;
		if(head == tail) {
			tail = -1;
			head = -1;
		} else if (tail < head && head == maxSize-1){
			head = 0;
		} else {
			head ++;			
		}
		//do something if the head is on the last place
		return data;
		
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("The queue is empty");
		}
		return queue[head];		
	}
	
	public boolean isEmpty() {
		if(head == -1 && tail == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if((head<tail && tail-head==maxSize-1)||(head>tail && head-tail==1)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "[";
		for(int i = 0; i < queue.length-1; i++) {
			s += queue[i] + ", ";
		}
		s += queue[queue.length-1] + "]";
		return s + " head: " + head + " tail: " + tail;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(5);
		q.enqueue(5);
		

	}

}
