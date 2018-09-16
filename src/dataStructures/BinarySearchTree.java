package dataStructures;

public class BinarySearchTree {
	
	private TreeNode root;

	public BinarySearchTree(TreeNode root) {
		this.root = root;
	}
	
	public void insert(int data) {
		if(root!=null) {
			root.insert(data);
		} else {
			this.setRoot(new TreeNode(data));
		}
	}
	
	public TreeNode find(int data) {
		if(root != null) {
			return root.find(data);			
		}
		return null;
	}
	
	public void delete(int data) {
		this.root.delete(data);
	}
	
	/*public void delete(int data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null) // the tree is empty
			return;
		while(current != null && current.getData() != data) {
			parent = current;
			
			if(data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		
		if(current == null) // the data does not exist
			return;
		
		if(current.getLeftChild() == null && current.getRightChild() == null) {
			//Node to be deleted is a leaf
			if(current == root) {
				this.setRoot(null);
			} else {
				if(isLeftChild) 
					parent.setLeftChild(null);
				 else 
					parent.setRightChild(null);				
			}
		//Node to be deleted has 1 child
		} else if (current.getRightChild() == null) {
			if(current == root) {
				root = current.getLeftChild();
			} else if (isLeftChild){
				parent.setLeftChild(current.getLeftChild());
			} else {
				parent.setRightChild(current.getLeftChild());
			}
		} else if (current.getLeftChild() == null) {
			if(current == root) {
				root = current.getRightChild();
			} else if (isLeftChild){
				parent.setLeftChild(current.getRightChild());
			} else {
				parent.setRightChild(current.getLeftChild());
			}
		}//Node to be deleted has 2 children
		// TODO if you have nothing to do too complicated maaan
		
	}
*/
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void inOrderTraverse() {
		if(root == null)
			System.out.println("The tree is empty");
		else
			root.inOrderTraverse();
	}
	
	public void preOrderTraverse() {
		if(root == null)
			System.out.println("The tree is empty");
		else
			root.preOrderTraverse();
	}
	
	public void postOrderTraverse() {
		if(root == null)
			System.out.println("The tree is empty");
		else
			root.postOrderTraverse();
	}
	
	@Override
	public String toString() {
		
		return "Min: " + root.minMax(true) + ", root: " + root + ", max: " + root.minMax(false);
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(null);
		bst.insert(4);
		bst.insert(2);
		bst.insert(8);
		bst.insert(1);
		bst.insert(3);
		bst.insert(7);
		bst.insert(9);
		
		System.out.println("In order: ");
		bst.inOrderTraverse();
		
		System.out.println("\nPre order: ");
		bst.preOrderTraverse();
		
		System.out.println("\nPost order: ");
		bst.postOrderTraverse();
	}

}
