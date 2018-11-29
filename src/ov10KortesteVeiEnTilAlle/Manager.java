package ov10KortesteVeiEnTilAlle;

import java.util.ArrayList;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Manager {
	public static void main(String[] args) {
		
		Map d1 = new Hashtable();
		Map d2 = new Hashtable();
		Map d3 = new Hashtable();
		Map d4 = new Hashtable();
		Map d5 = new Hashtable();
		Network network = new Network();
		
		Node n1 = new Node(1, 1.0f);
		Node n2 = new Node(2, 0.5f);
		Node n3 = new Node(3, 0.75f);
		Node n4 = new Node(4, 0.8f);
		Node n5 = new Node(5, 0.6f);
		Node n6 = new Node(6, 0.9f);
		
		d1.put(n2, 6);
		d1.put(n3, 3);
		n1.setNeighbours(d1);
		
		d2.put(n4, 3);
		d2.put(n6, 12);
		n2.setNeighbours(d2);
		
		d3.put(n4, 4);
		d3.put(n5, 6);
		n3.setNeighbours(d3);
		
		d4.put(n6, 1);
		n4.setNeighbours(d4);
		
		d5.put(n6, 5);
		n5.setNeighbours(d5);
		
		List<Node> graph = new ArrayList<Node>();
		graph.add(n1);graph.add(n2);graph.add(n3);graph.add(n4);graph.add(n5);graph.add(n6);
		
		printGraph(graph);
		
		/*network.initialize_single_source(graph, n1);
		System.out.println("\nInitialised single source:");
		printGraph(graph);
		
		network.relaxThemAll(graph, n1);
		System.out.println("\nRelaxed them all:");
		printGraph(graph);*/
		
		network.dijakstra(graph,n1);
	}
	
	private static void printGraph(List<Node> graph) {
		for(Node n : graph) {
			System.out.println(n);
		}
	}
}
