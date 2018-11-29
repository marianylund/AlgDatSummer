package ov10KortesteVeiEnTilAlle;

import java.util.ArrayList;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Manager2 {
	public static void main(String[] args) {
		
		Map d1 = new Hashtable();
		Map d2 = new Hashtable();
		Map d3 = new Hashtable();
		Map d4 = new Hashtable();
		Map d5 = new Hashtable();
		Map d6 = new Hashtable();
		Network network = new Network();
		
		Node n1 = new Node(1, 1.0f);
		Node n2 = new Node(2, 1.0f);
		Node n3 = new Node(3, 1.0f);
		Node n4 = new Node(4, 1.0f);
		Node n5 = new Node(5, 1.0f);
		Node n6 = new Node(6, 1.0f);
		
		d1.put(n2, 7);
		d1.put(n3, 5);
		d1.put(n4, 2);
		n1.setNeighbours(d1);
		
		d2.put(n1, 7);
		d2.put(n5, 3);
		d2.put(n6, 8);
		n2.setNeighbours(d2);
		
		d3.put(n1, 5);
		d3.put(n4, 10);
		d3.put(n5, 4);
		n3.setNeighbours(d3);
		
		d4.put(n1, 2);
		d4.put(n3, 10);
		d4.put(n6, 2);
		n4.setNeighbours(d4);
		
		d5.put(n2, 3);
		d5.put(n3, 4);
		d5.put(n6, 6);
		n5.setNeighbours(d5);
		
		d6.put(n2, 8);
		d6.put(n4, 2);
		d6.put(n5, 6);
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
		printGraph(graph);
	}
	
	private static void printGraph(List<Node> graph) {
		for(Node n : graph) {
			System.out.println(n);
		}
	}
}
