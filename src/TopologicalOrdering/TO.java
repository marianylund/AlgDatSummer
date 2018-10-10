package TopologicalOrdering;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import DepthFirstSearch.Vertex;

public class TO {
	
	private Stack<Vertex> stack;
	
	public TO() {
		this.stack = new Stack<>();
	}

	public void dfs(Vertex vertex) {
		vertex.setVisited(true);
		
		for(Vertex v : vertex.getNeighbours()) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
		
		stack.push(vertex);
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}
	
	public void getTO(List<Vertex> graph) {
		for(int i = 0; i < graph.size(); ++i) {// why ++i not i++
			if(!graph.get(i).isVisited()) {
				dfs(graph.get(i));
			}
		}
		for(int i = 0; i < graph.size(); i++) {
			Vertex vertex = this.stack.pop();
			System.out.print(vertex + " -> ");
		}
	}
	// should actually wrap it around another function, again to check for different clusters, but I get the idea
	private void checkForCycles(Vertex v) {
		v.setVisited(false);
		v.setBeingVisited(true);
		
		for(Vertex ve : v.getNeighbours()) {
			if(ve.isBeingVisited()) {
				System.out.println("There is a cycle, panic");
				return;
			}
			
			if(!ve.isVisited()) {
				ve.setVisited(true);
				checkForCycles(ve);
			}
		}
		
		v.setVisited(true);
		v.setBeingVisited(false);
	}
	
	public static void main(String[] args) {
		List<Vertex> graph = new ArrayList<>();
		
		graph.add(new Vertex("zero"));
		graph.add(new Vertex("one"));
		graph.add(new Vertex("two"));
		graph.add(new Vertex("three"));
		graph.add(new Vertex("four"));
		graph.add(new Vertex("five"));
		
		graph.get(2).addNeighbourVertex(graph.get(3));
		graph.get(3).addNeighbourVertex(graph.get(1));
		graph.get(4).addNeighbourVertex(graph.get(0)); graph.get(4).addNeighbourVertex(graph.get(1));
		graph.get(5).addNeighbourVertex(graph.get(0)); graph.get(5).addNeighbourVertex(graph.get(2));
		graph.get(0).addNeighbourVertex(graph.get(2));

		
		TO to = new TO();
		to.checkForCycles(graph.get(0));
		//to.getTO(graph);
	}
	
}
