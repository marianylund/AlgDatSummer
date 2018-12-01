package kruskal;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");
		
		Edge ab = new Edge(a, b, 2);
		Edge ac = new Edge(a, c, 6);
		Edge af = new Edge(a, f, 10);
		Edge ae = new Edge(a, e, 5);
		a.addNeighbours(ab,ac,af,ae);
		
		Edge be = new Edge(b, e, 3);
		Edge bd = new Edge(b, d, 3);
		b.addNeighbours(be,bd);
		
		Edge cd = new Edge(c, d, 1);
		Edge cf = new Edge(c, f, 2);
		c.addNeighbours(cd,cf);
		
		Edge de = new Edge(d, e, 4);
		Edge dg = new Edge(d, g, 5);
		d.addNeighbours(de,dg);
		
		Edge fg = new Edge(f, g, 5);
		f.addNeighbours(fg);
		
		List <Edge> edges = new ArrayList<>();
		List<Vertex> vertices = new ArrayList<>();
		
		vertices.add(a);vertices.add(b);vertices.add(c);
		vertices.add(d);vertices.add(e);vertices.add(f);
		vertices.add(g);
		
		for(Vertex v : vertices) {
			for(Edge ed : v.getNeighbours()) {
				if(!edges.contains(ed)) {
					edges.add(ed);
				}
			}
		}
		
		System.out.println("Edges total: " + edges.size());
		
		Kruskal.kruskal(edges, vertices);
		
		
	}
}
