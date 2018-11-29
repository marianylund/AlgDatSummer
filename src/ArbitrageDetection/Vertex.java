package ArbitrageDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String currency;
	private Vertex previous;
	private double cost = Integer.MAX_VALUE;
	private boolean visited = false; // do we need it?
	List<Edge> conversions;
	
	public Vertex(String currency) {
		this.currency = currency;
		this.conversions = new ArrayList<>(); 
	}

	public Vertex getPrevious() {
		return previous;
	}

	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Edge> getConversions() {
		return conversions;
	}

	public void setConversions(List<Edge> conversions) {
		this.conversions = conversions;
	}

	public String getCurrency() {
		return currency;
	}
	
	

}
