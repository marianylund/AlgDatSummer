package kruskal;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private Vertex previous;
	private int cost = Integer.MAX_VALUE;
	private List<Edge> neighbours;
	private Vertex representative;
	private int order;
	
	public Vertex(String name) {
		this.name = name;
		this.neighbours = new ArrayList<>();
		this.representative = this;
	}
	

	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}

	public Vertex getPrevious() {
		return previous;
	}

	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<Edge> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Edge> neighbours) {
		this.neighbours = neighbours;
	}

	public String getName() {
		return name;
	}
	
	public void addNeighbours(Edge ...edges) {
		for(Edge e : edges) {
			if(!neighbours.contains(e)) {
				neighbours.add(e);
			}	
		}
	}

	public Vertex getRepresentative() {
		if(representative != this) {
			representative.getRepresentative();
		}
		return representative;
	}

	public void setRepresentative(Vertex representative) {
		this.representative = representative;
	}
	
	public boolean mergeVertices(Vertex v) {
		
		Vertex v1 = this.getRepresentative(); 
		Vertex v2 = v.getRepresentative();
		
		if(v1 != v2) {
			System.out.println("Merging " + this + " with " + v);
			if(v1.getOrder()>= v2.getOrder()) {
				v1.setRepresentative(v2);
				System.out.println("Just got new rep: " + v1 + " so " + this);
				v1.setOrder(v2.getOrder()+1);
			}else {
				System.out.println("Just got new rep: " + v2 + " so " + v);
				v2.setRepresentative(v1);
				v2.setOrder(v1.getOrder()+1);
			}
			
			System.out.println("Now connected " + this + " with " + v);
			return true;
		}
		System.out.println("Already have the same rep " + this + " with " + v);
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = this.getName();
		if(this != this.getRepresentative()) {
			s += " rep: " + this.getRepresentative().getName();
		}
		return s;
	}
}
