package Sorting;

public class InsertionSort implements SortingAlgorithm{

	public int[] sort(int[] input) {
		
		for(int i = 0; i < input.length; i++) {
			int current = input[i];
			int j = i-1;
			while(j>=0 && input[j] > current) {
				input[j+1] = input[j];
				j = j-1;
			}
			input[j+1] = current;
		}
		return input;
	}
	
	@Override
	public String toString() {
		return "InsertionSort";
	}

}
