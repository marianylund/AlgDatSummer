package BFSAlg;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private int data;
	private boolean visited;
	private List<Vertex> neighbours;
	
	public Vertex(int data) {
		this.data = data;
		this.visited = false;
		this.neighbours = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Vertex> neighbours) {
		this.neighbours = neighbours;
	}
	
	public void addNeighbourVertex(Vertex e) {
		this.neighbours.add(e);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.data;
	}

}
