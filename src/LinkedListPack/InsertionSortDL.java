package linkedListPack;

public class InsertionSortDL{

	public DoublyLinkedList sort(DoublyLinkedList list) {
		
		DLNode insertionPointer = list.getHead(); // black pointer
		DLNode current = list.getHead().getNextNode(); // blue pointer
		
		while(current != null ) { // while not all are sorted
				
			if(insertionPointer.getData() > current.getData()) {	
				
				insertionPointer = findWhereTo(insertionPointer, current);
				
				System.out.println("Swappity swapity between " + insertionPointer + " and " + current);
				
				DLNode nextCurrent = current.getNextNode();
				
				if(current.getNextNode()!=null) {
					current.getNextNode().setPrevNode(current.getPrevNode()); 
				}
				
				current.getPrevNode().setNextNode(current.getNextNode()); 
				
				current.setNextNode(insertionPointer); 
				current.setPrevNode(insertionPointer.getPrevNode()); 
				
				if(insertionPointer.getPrevNode() == null) {
					list.setHead(current);
				} else {
					insertionPointer.getPrevNode().setNextNode(current);
				}
				
				insertionPointer.setPrevNode(current);
				

				
				current = nextCurrent;
				if(current != null) {
					insertionPointer = current.getPrevNode();
				}
				
					
				
				System.out.println("List has changed: " + list + " ins: " + insertionPointer + ", cur: " + current);
			}else {
				//if sorted, then change to the next
				insertionPointer = current;
				current = current.getNextNode();
			}		
		}
	
		return list;
	}
	
	private DLNode findWhereTo(DLNode whereTo, DLNode current) {
		if(whereTo.getPrevNode() != null && whereTo.getPrevNode().getData() > current.getData()) {
			System.out.println("Where to " + whereTo);
			return findWhereTo(whereTo.getPrevNode(), current);
		}
		System.out.println("Final whereto: " + whereTo);
		return whereTo;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dllist = new DoublyLinkedList();
		dllist.insertAtHead(10);
		dllist.insertAtHead(7);
		dllist.insertAtHead(8);
		dllist.insertAtHead(11);
		dllist.insertAtHead(9);
		dllist.insertAtHead(25);
		
		System.out.println(dllist);
		
		InsertionSortDL sortdl = new InsertionSortDL();
		sortdl.sort(dllist);
		
		System.out.println(dllist);
	}

}
