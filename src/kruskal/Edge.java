package kruskal;

public class Edge implements Comparable<Edge>{

	private Vertex from;
	private Vertex to;
	private int weight;
	
	public Edge(Vertex from, Vertex to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	public Vertex getFrom() {
		return from;
	}
	public void setFrom(Vertex from) {
		this.from = from;
	}
	public Vertex getTo() {
		return to;
	}
	public void setTo(Vertex to) {
		this.to = to;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge o) {
		return Integer.compare(this.getWeight(), o.getWeight());
	}
	
	@Override
	public String toString() {
		return from.getName() + " - " + weight + " - " + to.getName();
	}
	
}
