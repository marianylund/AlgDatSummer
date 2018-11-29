package ov10KortesteVeiEnTilAlle;

import java.util.Map;

public class Node implements Comparable<Node>{
	
	/* 
	 * ip::Int
	 * neighbours::Array{Tuple{Node,Int}}
	 * risk::Union{Float64, Nothing}
	 * predecessor::Union{Node, Nothing}
	 * probability::Float64
	 */
	
	private int ip;
	//private Dictionary dict = new Hashtable();
	private Map<Node, Integer> neighbours;
	private float risk = Float.MAX_VALUE;
	private Node predecessor;
	private float probability; // ⟨0,1]
	
	public Node(int ip, float probability) {
		this.ip = ip;
		this.probability = probability;
	}
	

	public void setNeighbours(Map<Node, Integer> neighbours) {
		this.neighbours = neighbours;
	}


	public float getRisk() {
		return risk;
	}

	public void setRisk(float risk) {
		this.risk = risk;
	}

	public Node getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Node predecessor) {
		this.predecessor = predecessor;
	}

	public int getIp() {
		return ip;
	}

	public Map<Node, Integer> getNeighbours() {
		return neighbours;
	}

	public float getProbability() {
		return probability;
	}
	
	
	@Override
	public String toString() {
		return "IP: " + ip + ", prob: " + probability + ", risk: " + risk;
	}


	@Override
	public int compareTo(Node otherNode) {
		return Float.compare(this.getRisk(), otherNode.getRisk());
	}
	
}
