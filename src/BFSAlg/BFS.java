package BFSAlg;

import java.util.LinkedList;
import java.util.Queue;


public class BFS {
	
	public void bfs(Vertex root) {
		Queue<Vertex> queue = new LinkedList<>();
		
		queue.add(root);
		Vertex current = null;
		while(!queue.isEmpty()) {
			current = queue.remove();
			if(!current.getNeighbours().isEmpty()) {
				for (Vertex n : current.getNeighbours()) {
					if(!n.isVisited()) {
						queue.add(n);						
					}
				}
			}
			System.out.println(current);
			current.setVisited(true);
		}
		
	}

}
