package DepthFirstSearch;

public class DFS {
	
	public void dfs(Vertex root) {
		root.setVisited(true);
		System.out.println("Visited: " + root);
		
		if(!root.getNeighbours().isEmpty()) {
			for(Vertex n : root.getNeighbours()) {
				if(!n.isVisited()) {
					dfs(n);
				}
			}
		}
	}

}
