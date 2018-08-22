package LinkedListPack;

public class DoublyEndedList {

	private Node head;
	private Node tail;
	
	public void insertAtTail(int data) {
		
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		}
		
		if(this.tail != null) {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}else {
			this.tail = newNode;
		}
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
		DoublyEndedList del = new DoublyEndedList();
		
		del.insertAtTail(2);
		del.insertAtTail(3);
		del.insertAtTail(4);
		
		System.out.println(del);
	}
	
}
