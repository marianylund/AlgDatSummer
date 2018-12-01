package kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Kruskal {

	protected static void kruskal(List<Edge> edges, List<Vertex> vertices) {
		Collections.sort(edges);
		List<Edge> mst = new ArrayList<Edge>();
		System.out.println("MST: ");
		for(Edge e : edges) {
			if(e.getFrom().mergeVertices(e.getTo())) {
				System.out.println(e);
				mst.add(e);
			}
		}
		int minSum = edges.stream().mapToInt(e -> e.getWeight()).sum();
		System.out.println("With the sum: " + minSum + " edges total: " + mst.size());
	}
	
}
