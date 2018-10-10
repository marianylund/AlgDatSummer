package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean visited;
	private boolean beingVisited;
	

	private List<Vertex> neighbours;
	
	public Vertex(String name) {
		this.name = name;
		this.visited = false;
		this.neighbours = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
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
		return "" + this.name;
	}

}
