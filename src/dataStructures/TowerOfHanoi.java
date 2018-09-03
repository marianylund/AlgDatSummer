package dataStructures;

public class TowerOfHanoi {
	
	Stack A;
	Stack B;
	Stack C;
	
	public TowerOfHanoi(int disks) {
		A = new Stack(disks);
		B = new Stack(disks);
		C = new Stack(disks);
		for(int i = 1; i<=disks;i++) {
			A.push(i);
		}
		System.out.println("Tower of Hanoi initiated: " + A);
	}
	
	public void move(int disks, Stack from, Stack to, Stack using) {
		if(disks == 1) {
			to.push(from.pop());
			System.out.println("Moving " + disks + "disks from " + from + " to " + to);
		} else {
			this.move(disks - 1, from, using, to);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi t = new TowerOfHanoi(3);
		t.move(3, t.A, t.C, t.B);
		
	}

}
