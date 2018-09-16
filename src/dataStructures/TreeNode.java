package dataStructures;

public class TreeNode {
	
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted = false;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void insert(int data) {
		if(this.getData() >= data) {
			if(this.getLeftChild() == null || this.getLeftChild().isDeleted()) {
				this.setLeftChild(new TreeNode(data));
			}else {
				this.getLeftChild().insert(data);
			}
			
		}else {

			if(this.getRightChild() == null || this.getRightChild().isDeleted()) {
				this.setRightChild(new TreeNode(data));
			}else {
				this.getRightChild().insert(data);
			}
		}
	}

	private boolean isDeleted() {
		return isDeleted;
	}

	public TreeNode find(int data) {
		if(this.getData() == data && !isDeleted) {
			return this;
		} else if(this.getData() < data && this.getRightChild() != null) {
			this.getRightChild().find(data);
		} else if(this.getData() > data && this.getLeftChild() != null) {
			this.getLeftChild().find(data);
		} 
		return null;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public int getData() {
		return data;
	}

	public TreeNode minMax(boolean min) {
		if(min) {
			if(this.getLeftChild() != null)
				return this.getLeftChild().minMax(min);		
		}else 
			if(this.getRightChild() != null) 
				return this.getRightChild().minMax(min);		
		return this;
	}
	
	public void delete(int data) {
		TreeNode toDel = this.find(data);
		toDel.isDeleted = true;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.getData());
	}

	public void inOrderTraverse() {
		if(this.getLeftChild()!=null) {
			this.getLeftChild().inOrderTraverse();
		}
		System.out.print(this + " ");
		if(this.getRightChild()!=null) {
			this.getRightChild().inOrderTraverse();
		}
		
	}

	public void preOrderTraverse() {
		System.out.print(this + " ");
		
		if(this.getLeftChild()!=null) {
			this.getLeftChild().preOrderTraverse();
		}
		
		if(this.getRightChild()!=null) {
			this.getRightChild().preOrderTraverse();
		}
		
	}
	
	public void postOrderTraverse() {		
		if(this.getLeftChild()!=null) {
			this.getLeftChild().postOrderTraverse();
		}
		
		if(this.getRightChild()!=null) {
			this.getRightChild().postOrderTraverse();
		}
		
		System.out.print(this + " ");
	}
}
