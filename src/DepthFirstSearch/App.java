package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		Vertex v1 = new Vertex("One");
		Vertex v2 = new Vertex("Two");
		Vertex v3 = new Vertex("Three");
		Vertex v4 = new Vertex("Four");
		Vertex v5 = new Vertex("Five");
		
		v1.addNeighbourVertex(v2);v1.addNeighbourVertex(v5);
		
		v2.addNeighbourVertex(v3);v2.addNeighbourVertex(v4);
		v3.addNeighbourVertex(v5);
		
		List<Vertex> l = new ArrayList<>();
		l.add(v2);l.add(v5);l.add(v4);l.add(v3);l.add(v1);
		
		dfs.dfs(l);
	}
	
	/*
	 * 	Visited: Two
		Visited: Three
		Visited: Five
		Visited: Four
		Visited: One
	 */

}
