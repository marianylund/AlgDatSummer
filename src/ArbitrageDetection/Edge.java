package ArbitrageDetection;

public class Edge {

	private Vertex from;
	private Vertex to;
	private double weight;
	
	public Edge(Vertex from, Vertex to, double weight) {
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
