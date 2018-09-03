package linkedListPack;

public class DBLinkedQueue {
	
	/*
	 * Implement a stack using a linked list as an underlying 
	 * data structure (instead of array) What advantage do you 
	 * think will it have against using arrays? You can use a DoublyLinkedNode.
	 * 
	 * - No maxsize ;D no circling around
	 */
	
	public DoublyLinkedList queue;
	private DLNode tail;
	
	public DBLinkedQueue() {
		queue = new DoublyLinkedList();
	}

	public DLNode getHead() {
		return queue.getHead();
	}

	public void setHead(DLNode head) {
		queue.setHead(head);
	}

	public DLNode getTail() {
		return tail;
	}

	public void setTail(DLNode tail) {
		this.tail = tail;
	}
	
	public boolean isEmpty() {
		if(this.getHead()==null && this.getTail()==null) {
			return true;
		}
		return false;
	}
	
	
	public void enqueue(int data) {
		DLNode newNode = new DLNode(data);
		
		if(this.isEmpty()) {
			queue.setHead(newNode);
		}else {
			newNode.setPrevNode(tail);
			this.getTail().setNextNode(newNode);
		}
		this.setTail(newNode);
	}
	
	public int dequeue() {
		if(this.isEmpty()) {
			throw new IllegalStateException("Nothing to look at here, it's empty");
		} else {
			int data = queue.getHead().getData();
			
			DLNode newHead = queue.getHead().getNextNode();
			newHead.setPrevNode(null);
			queue.setHead(newHead);
			
			return data;
		}
	}
	
	public int peek() {
		if(this.isEmpty()) {
			throw new IllegalStateException("Nothing to look at here, it's empty");
		} else {
			return queue.getHead().getData();
		}
	}
	

	
	@Override
	public String toString() {
		return queue.toString();
	}
	
	public static void main(String[] args) {
		DBLinkedQueue q = new DBLinkedQueue();
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(32);
		System.out.println(q);
		System.out.println(q.dequeue() + " " + q);
		System.out.println(q.peek() + " " + q);
	}

}
