package Sorting;

import java.util.ArrayList;

public class ShellSort implements SortingAlgorithm{

	@Override
	public int[] sort(int[] input) {
		return shellSort(input, findH(input.length));
	}
	
	private int[] shellSort(int[] input, ArrayList<Integer> harray) {
		for(int i = harray.size() - 1; i>=0; i--) {
			input = insertionSort(input, harray.get(i));
		}
		return input;
	}
	
	private int[] insertionSort(int[] input, int h) {
		System.out.println("Sort every " + h + " element");
		
		for(int i = 0; i < input.length; i = i+h) {
			int current = input[i];
			int j = i-h;
			while(j>=0 && input[j] > current) {
				System.out.println("Input[j] " + input[j] + ", current " + current);
				input[j+h] = input[j];
				j = j-h;
			}
			input[j+h] = current;
		}
		
		return input;
	}
	
	private ArrayList<Integer> findH(int len) {
		ArrayList<Integer> harray = new ArrayList<Integer>();
		int h = 0;
		while(h < len) {
			harray.add(h);
			h = 3*h + 1;
		}
		return harray;
	}
	
	@Override
	public String toString() {
		return "ShellSort";
	}

}
