package ArbitrageDetection;

import java.util.List;

public class BellmanFord {
	
	List<Vertex> vertexList;
	List<Edge> edgeList;
	
	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}
	
	protected void bellmanford(Vertex source) {
		source.setCost(0);
		

		for(int i = 0; i < vertexList.size()-1; i++) {
			double newCost = 

		}
		
		//check for cycles
		for(Edge e : edgeList) {
			
		}
		
		// Find cycle
		// Backtrack and show where the cycle is
	}

}
