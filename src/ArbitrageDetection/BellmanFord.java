package ArbitrageDetection;

import java.util.List;

public class BellmanFord {
	
	List<Vertex> vertexList;
	List<Edge> edgeList;
	
	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}
	
	protected void bellmanFord(Vertex source) {
		source.setCost(0);

		for(int i = 0; i < vertexList.size()-1; i++) {
			for(Edge e : edgeList) {
				
				Vertex u = e.getFrom();
				Vertex b = e.getTo();
				double newCost = u.getCost() + e.getWeight();
				
				if(newCost < b.getCost()) {
					b.setCost(newCost);
					b.setPrevious(u);
				}
				
			}

		}
		
		//check for cycles
		for(Edge e : edgeList) {
			if(e.getFrom().getCost() + e.getWeight() < e.getTo().getCost()) {
				System.out.println("There is a negative cycle from " + e.getFrom().getCurrency() + " to " + e.getTo().getCurrency());
			}
		}
		
		// Find cycle
		// Backtrack and show where the cycle is
	}

}
