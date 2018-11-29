package ov10KortesteVeiEnTilAlle;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


public class Network {
	
	protected void initialize_single_source(List<Node> graph, Node start) {
		// graph som er en liste med nodeobjekter.
		// start som er startnoden i grafen
		
		start.setRisk(0);
		
	}
	
	protected void relax(Node from, Node to, int cost) {
		//System.out.println("Relaxing from: " + from.getIp() + " to " + to.getIp());
		//System.out.println(from.getRisk() + " + " + "(" + cost + "/" + to.getProbability() + ")");
		float newRisk = from.getRisk() + (cost/to.getProbability());
		if(newRisk < to.getRisk()) {
			to.setPredecessor(from);
			to.setRisk(newRisk);
		}
	}

	protected void bellmanFord(List<Node> graph, Node start) {
		start.setRisk(0);
		// Any way to do this without having the Edge class? :O 
	}
	
	protected void relaxThemAll(List<Node> graph, Node start) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(start);
		Node current = null;
		
		while(!queue.isEmpty()) {
			current = queue.remove();

			if(current.getNeighbours() != null) {
	
				for (Map.Entry<Node, Integer> entry : current.getNeighbours().entrySet() ) {
					Node node = entry.getKey();
					
					if(node.getRisk() == Integer.MAX_VALUE) {
						queue.add(node);
					}
					int cost = entry.getValue();
					relax(current, node, cost);						
				}
			}
		}
		
	}
	
	protected void dijakstra(List<Node> graph, Node start) {
		start.setRisk(0);
		PriorityQueue<Node> queue = new PriorityQueue<>();
		queue.add(start);
		
		Node current = null;
		while(!queue.isEmpty()) {
			current = queue.poll();
			
			if(current.getNeighbours() != null) {
				
				for (Map.Entry<Node, Integer> entry : current.getNeighbours().entrySet() ) {
					
					Node node = entry.getKey();
					int cost = entry.getValue();
					float newRisk = current.getRisk() + (cost/node.getProbability());
					
					// Relaxing the edge
					if(newRisk < node.getRisk()) {
						queue.remove(node);
						node.setPredecessor(current);
						node.setRisk(newRisk);
						queue.add(node);
					}
				}
			}
			
		}
		
		System.out.println("Best paths:");
		for(Node g : graph) {
			System.out.println(getPath(g));				
		}
		
	}
	
	protected String getPath(Node to) {
		String path = "";
		Node current = to;
		while(current.getPredecessor() != null) {
			current = current.getPredecessor();
			path = current.getIp() + " -> " + path;
		}
		
		return path += String.valueOf(to.getIp());
		
	}
	
}
