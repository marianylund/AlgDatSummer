package Sorting;

public class MergeSort implements SortingAlgorithm{

	/*
	 * 
	 * @see Sorting.SortingAlgorithm#sort(int[])
	 */
	
	@Override
	public int[] sort(int[] input) {
		return mergeSort(input, 0, input.length-1);
	}
	
	private int[] mergeSort(int[] A, int start, int end) {
		if(start < end) {
			int middle = (int) Math.floor((start + end)/2);
			mergeSort(A, start, middle);
			mergeSort(A, middle + 1, end);
			merge(A, start, middle, end);
		}
		
		return A;
	}
	
	private int[] merge(int[] A, int start, int middle, int end) {
		// find size
		int leftSize = middle - start + 1;
		int rightSize = end - middle;
		// create arrays
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		// copy
		for(int i = 0; i <= leftSize-1; i ++) {
			left[i] = A[start + i];
		}
		for(int j = 0; j <= rightSize-1; j ++) {
			right[j] = A[middle + 1 + j];
		}
		// merge them
		int i = 0, j = 0;
		for(int k = start; k <= end; k++) {
			// STYGGT OMG WTF
			if(i>=left.length) {
				A[k] = right[j];
				j++;
			} else if (j>=right.length) {
				A[k] = left[i];
				i++;
			} else if(right[j]<=left[i]) {
				A[k] = right[j];
				j++;		
			}else if (left[i]<=right[j]){
				A[k] = left[i];
				i++;
			}
		}
		return A;
	}

	
	@Override
	public String toString() {
		return "MergeSort";
	}
}
