package Sorting;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort implements SortingAlgorithm{

	// Worst: O(n^2)
		
		public int[] sort(int[] input) {
			
			
			for (int i = 0; i < input.length-1; i++) {
				int minIndex = i;
				for (int j = i+1; j < input.length; j++) {
					if(input[j] < input[minIndex]) {
						minIndex = j;
					}
				}
				int tmp = input[minIndex];
				input[minIndex] = input[i];
				input[i] = tmp;
			}
			
			return input;
		}
	
		@Override
		public String toString() {
			return "SelectionSort";
		}
}
