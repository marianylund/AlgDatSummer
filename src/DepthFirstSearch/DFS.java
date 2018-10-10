package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	
	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<>();
	}
	
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
		this.stack.add(root);
		root.setVisited(true);
		
		while(! stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println("Visited: " + actualVertex);
			
			for(Vertex v : actualVertex.getNeighbours()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
	}

}
