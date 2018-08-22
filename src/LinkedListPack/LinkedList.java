package LinkedListPack;

public class LinkedList {

	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		this.head = newNode;
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
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insertAtHead(10);
		l.insertAtHead(5);
		l.insertAtHead(2);
		l.insertAtHead(2);
		
		System.out.println(l);
		System.out.println(l.getLength());
		l.deleteAtHead();
		System.out.println(l);
		
		System.out.println("Found: " + l.findItem(10));
		
		l.insertAtHead(11);
		l.insertAtHead(17);
		System.out.println(l);
		l.deleteItem(5);
		System.out.println(l);
	}
}
