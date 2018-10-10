package BFSAlg;

import java.util.List;
import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		//List<Vertex> v = new ArrayList<>();
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		
		//v.add(v1);v.add(v2);v.add(v3);v.add(v4);v.add(v5);
		v1.addNeighbourVertex(v2);v1.addNeighbourVertex(v3);v1.addNeighbourVertex(v4);
		
		v2.addNeighbourVertex(v1);
		v4.addNeighbourVertex(v3);
		v5.addNeighbourVertex(v2);
		v5.addNeighbourVertex(v3);
		
		BFS bfs = new BFS();
		bfs.bfs(v5);
	}
	
	
	/*
	 * 	Visited: Two
		Visited: Three
		Visited: Five
		Visited: Four
		Visited: One
	 */

}
