package linkedListPack;

public class LinkedList {

	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		this.head = newNode;
	}
	
	/*
	 * Append the last n nodes of a linked list to the beginning of the list. 
	 * Will keeping the length as a member variable inside the LinkedList class
	 */
	
	public void endToBeginning(int n) {
		int length = this.getLength();
		int goTo = length - n;
		Node current = this.head;
		//find the new beginning
		for(int i = 1; i < goTo; i++) {
			current = current.getNextNode();
		}
		
		Node lastOne = findLast(current);
		lastOne.setNextNode(this.head);
		System.out.println("The last one: " + lastOne);
		
		Node newHead = current.getNextNode();
		System.out.println("New head: " + newHead);
		
		current.setNextNode(null);

		this.head = newHead;
		
	}
	
	private Node findLast(Node start) {
		System.out.println("New last: " + start);
		if(start.getNextNode() != null) {
			return findLast(start.getNextNode());
		}
		return start;
	
	}
	
	/*
	 * Write a 'reverse' method in the LinkedList class, 
	 * which reverses the order of the elements of the list.
	 */
	
	public void reverseList() {
		Node newFirst = null;
		Node newNext = this.head;
		int length = this.getLength();
		
		for(int i = 0; i < length; i++) {
			Node temp = newNext.getNextNode();
			
			newNext.setNextNode(newFirst);
			
			newFirst = newNext;
			newNext = temp;
		}
		
		this.head = newFirst;
		
		
	}
	
	public void deleteItem(int data) {
		Node current = this.head;
		while(current.getNextNode() != null) {
			if(current.getNextNode().getData() == data) {
				current.setNextNode(current.getNextNode().getNextNode());
				break;
			}else {
				current = current.getNextNode();
			}
		}
	}
	
	public Node findItem(int data) {
		Node current = this.head;
		while(current != null) {
			if(current.getData() == data) {
				return current;
			}
				current = current.getNextNode();				
		}
		return null;
	}
	
	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}
	
	public int getLength() {
		Node current = this.head;
		int length = 0;
		while(current != null) {
			length ++;
			current = current.getNextNode();
		}
		return length;
	}
	
	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while(current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result = result.substring(0, result.length() - 2) + "}";
		return result;
	}
	
	/*
	 * Write an algorithm to remove duplicates from an unsorted linked list. 
	 * What is the time complexity? (You can use the Set provided in the JDK). 
	 * How will you solve it if additional memory is not allowed?
	 */
	
	public void removeDuplicates() {
		Node current = this.head;
		while(current != null) {
			if(checkIfExists(current.getNextNode())) {
				//delete it!
				current.setNextNode(current.getNextNode().getNextNode());
			}
			
			current = current.getNextNode();		
		}
	}
	
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node n) {
		this.head = n;
	}
	
	public boolean checkIfExists(Node n) {
		if(n==null) {
			return false;
		}
		Node current = this.head;
		while(current != null) {
			// if the same data and not the same node
			if(current.getData() == n.getData() && current != n) {
				return true;
			}
			current = current.getNextNode();
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		
		l.insertAtHead(10);
		l.insertAtHead(5);
		l.insertAtHead(2);
		l.insertAtHead(2);
		l.insertAtHead(2);
		l.insertAtHead(20);
		l.insertAtHead(3);
		l.insertAtHead(56);
		l.insertAtHead(20);
		l.insertAtHead(3);
		l.insertAtHead(56);
		/*
		System.out.println(l);
		System.out.println(l.getLength());
		l.deleteAtHead();
		System.out.println(l);
		
		System.out.println("Found: " + l.findItem(10));
		
		System.out.println(l);
		l.deleteItem(5);
		System.out.println(l);
		 
		l.endToBeginning(5);
		System.out.println("After: " + l);
		*/
		System.out.println("Before: " + l);
		l.reverseList();
		System.out.println("Reversed: " + l);
		
		l.removeDuplicates();
		System.out.println("No Duplicates: " + l);
	}
}
