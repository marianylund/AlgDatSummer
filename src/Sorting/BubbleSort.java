package Sorting;
public class BubbleSort implements SortingAlgorithm{
	
	// Worst: O(n^2)
	
	public int[] sort(int[] input) {
		
		int tmp = -1;
		
		for (int i = 0; i < input.length-1; i++) {
			for (int j = 0; j < input.length-1-i; j++) {
				if(input[j] > input[j+1]) {
					tmp = input[j+1];
					input[j+1] = input[j];
					input[j] = tmp;
				}
			}
		}
		
		return input;
	}
	
	@Override
	public String toString() {
		return "BubbleSort";
	}
	
}
