package shortestPath;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class DijkstraAlg {
	
	public ArrayList<Node> dijkstra(MinHeap graph, Node source) {
		// TODO where do I get the neighbours from?? :/
		source.setDistance(0);
		Queue<Node> q = new LinkedList<>(); 
		
		for(Node n : graph.getList()) {
			n.setDistance(Integer.MAX_VALUE);
			n.setSuccessor(null);
			q.add(n);
		}
		
		while(!q.isEmpty()) {
			Node u = graph.extractMin();
			q.remove(u);
		}
		
		return null;
	}

}
