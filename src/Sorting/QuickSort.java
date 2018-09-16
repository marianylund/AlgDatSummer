package Sorting;

import java.util.Arrays;

public class QuickSort implements SortingAlgorithm{

	@Override
	public int[] sort(int[] input) {
		return quickSort(input, 0, input.length-1);
	}
	
	private int[] quickSort(int[] input, int start, int end) {
		if(start < end) {
			int pivot = partition(input, start, end);
			quickSort(input, start, pivot-1);
			quickSort(input, pivot+1, end);
		}
		return input;
	}
	
	private int partition(int[] input, int start, int end) {
		//System.out.println("Before partition: " + Arrays.toString(input));
		int pivot = input[end];
		int i = start;
		for(int j = start; j < end; j++) {
			if(input[j] <= pivot) {
				// exchange A[i] and A[j]
				int temp = input[i]; input[i] = input[j]; input[j] = temp;
				i++;
			}
		}
		//Exchange A[i] with A[end]
		int temp = input[i]; input[i] = input[end]; input[end] = temp;
		//System.out.println("After partition: " + Arrays.toString(input) + " pivot: " + input[i]);
		return i;
	}

	@Override
	public String toString() {
		return "QuickSort";
	}

}
