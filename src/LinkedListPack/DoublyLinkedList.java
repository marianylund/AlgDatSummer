package LinkedListPack;

public class DoublyLinkedList {

	private DLNode head;
	
	public DLNode getHead() {
		return head;
	}
	
	public int getLength() {
		DLNode current = this.head;
		int length = 0;
		while(current != null) {
			length ++;
			current = current.getNextNode();
		}
		return length;
	}
	
	public void insertAtHead(int data) {
		DLNode newNode = new DLNode(data);
		if(this.head != null) {
			this.head.setPrevNode(newNode);
			newNode.setNextNode(head);
		}
		this.head = newNode;
	}
	
	@Override
	public String toString() {
		String result = "{";
		DLNode current = this.head;
		
		while(current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result = result.substring(0, result.length() - 2) + "}";
		return result;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dllist = new DoublyLinkedList();
		dllist.insertAtHead(10);
		dllist.insertAtHead(7);
		dllist.insertAtHead(8);
		
		System.out.println(dllist);
	}
}
