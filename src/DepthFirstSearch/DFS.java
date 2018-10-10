package DepthFirstSearch;

import java.util.List;

public class DFS {
	
	/*Works only if all nodes are connected, but what if you want to traverse through two clusters ?
	 * 
	 * public void dfs(Vertex root) {
		root.setVisited(true);
		System.out.println("Visited: " + root);
		
		if(!root.getNeighbours().isEmpty()) {
			for(Vertex n : root.getNeighbours()) {
				if(!n.isVisited()) {
					dfs(n);
				}
			}
		}
	}*/ 
	
	public void dfs(List<Vertex> vertexList) {
		for(Vertex v : vertexList) {
			if(!v.isVisited()) {
				dfsWithStack(v);
			}
		}
	}
	
	private void dfsWithStack(Vertex root) {
		root.setVisited(true);
		System.out.println("Visited: " + root);
		
		if(!root.getNeighbours().isEmpty()) {
			for(Vertex n : root.getNeighbours()) {
				if(!n.isVisited()) {
					dfsWithStack(n);
				}
			}
		}
	}

}
