package shortestPath;

import java.util.List;

public class Node {

	private char name;
	private int distance;
	private Node successor;
	private List<Node> neighbourghs;
	
	public Node(char name) {
		this.name = name;
	}
	
	public Node(char name, int distance) {
		this.name = name;
		this.distance = distance;
	}
	
	public Node(char name, int distance, List<Node> neighbourghs) {
		this.name = name;
		this.distance = distance;
		this.neighbourghs = neighbourghs;
	}
	
	public List<Node> getNeighbourghs() {
		return neighbourghs;
	}

	public void setNeighbourghs(List<Node> neighbourghs) {
		this.neighbourghs = neighbourghs;
	}

	public char getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Node getSuccessor() {
		return successor;
	}

	public void setSuccessor(Node successor) {
		this.successor = successor;
	}
	
	@Override
	public String toString() {
		return Character.toString(this.name) + "(" + Integer.toString(distance) + ")";
	}
}
