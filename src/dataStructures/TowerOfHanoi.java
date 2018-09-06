package dataStructures;

public class TowerOfHanoi {
	
	int i = 0;
	
	// Talk to someone about it maybe :3
	

	public void move(int disks, char from, char to, char using) {
		if(disks == 1) {
			i ++;
			System.out.println(i + " Moving one disc" + from + " to " + to);
		} else {
			move(disks - 1, from, using, to);
			//System.out.println("Moving " + disks + " disks from " + from + " to " + to);
			move(disks - 1, using, to, from);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi t = new TowerOfHanoi();
		t.move(10, 'A', 'C', 'B');
		
	}

}
