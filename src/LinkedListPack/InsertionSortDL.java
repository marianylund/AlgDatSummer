package LinkedListPack;

public class InsertionSortDL{

	public DoublyLinkedList sort(DoublyLinkedList list) {
		
		DLNode insertionPointer = list.getHead(); // black pointer
		DLNode current = list.getHead().getNextNode(); // blue pointer
		
		while(current != null) {
			
			insertionPointer = list.getHead();
			
			while(insertionPointer != current) {
				if(insertionPointer.getData() > current.getData()) {	
					// swap places 
					System.out.println("Swappity swapity between " + insertionPointer + " and " + current);
					if()
					insertionPointer.setNextNode(current.getNextNode());
					current.getNextNode().setPrevNode(current.getPrevNode());
					
					current.setPrevNode(insertionPointer.getPrevNode());
					current.setNextNode(insertionPointer);
					
					insertionPointer.setPrevNode(current);
					
					list.he
					
					
					System.out.println("List has changed: " + list);
				}else {
					current = current.getNextNode();
					System.out.println("Next one! Ins: " + insertionPointer + ", current: " + current);
				}
			}		
		}
	
		return list;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dllist = new DoublyLinkedList();
		dllist.insertAtHead(10);
		dllist.insertAtHead(7);
		dllist.insertAtHead(8);
		
		System.out.println(dllist);
		
		InsertionSortDL sortdl = new InsertionSortDL();
		sortdl.sort(dllist);
		
		System.out.println(dllist);
	}

}
