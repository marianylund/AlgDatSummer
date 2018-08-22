package LinkedListPack;

public class DLNode {
	
	private int data;
	private DLNode nextNode;
	private DLNode prevNode;
	
	public DLNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DLNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DLNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public DLNode getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(DLNode prevNode) {
		this.prevNode = prevNode;
	}
	
	@Override
	public String toString() {
		
		return Integer.toString(getData());
	}

}
