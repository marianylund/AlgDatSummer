package BiPariteMatching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BFSAlg.Vertex;

public class FordFulk {
	
	private String[] names;
	private int[][] capacities;
	private int sink;
	
	public FordFulk(String[] names, int[][] capacities) {
		this.names = names;
		this.capacities = capacities;
		this.sink = capacities.length-1;
	}

	protected void getMaxFlowAndMatching() {
		List<Integer> augmentedFlow = getAugmentedFlow();
		int maxFlow = 0;
		
		while(augmentedFlow.contains(sink)) {
			System.out.println(names[augmentedFlow.get(2)] + " hires " + names[augmentedFlow.get(1)]);
			
			for(int i = 0; i < augmentedFlow.size() - 1; i++) {
				capacities[augmentedFlow.get(i)][augmentedFlow.get(i+1)] = 0;
			}
			maxFlow ++;
			augmentedFlow = getAugmentedFlow();
		}
		System.out.println("Maxflow is "+ maxFlow);
	}
	
	private List<Integer> getAugmentedFlow() {
		
		List<Integer> augmentedFlow = new ArrayList<>();
		
		int current = 0;
		augmentedFlow.add(0);
		
		for(int i = current; i <= sink; i++) {
			if(current == sink) { // found the sink => found the augmented flow
				return augmentedFlow;
			}
		
			if(capacities[current][i] > 0 && !augmentedFlow.contains(i)) { // there is a way!
				//System.out.println("Capacity between " + names[current] + " and " + names[i] + " is " + capacities[current][i]);
				augmentedFlow.add(i);
				current = i;
			}
		}
		
		return augmentedFlow; // TODO is that the minimal cut then?
	}
}
