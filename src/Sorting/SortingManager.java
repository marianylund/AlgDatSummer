package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SortingManager {

	private int[] input;
	private ArrayList<SortingAlgorithm> alg = new ArrayList<SortingAlgorithm>();
	
	public SortingManager(int length) {
		
		input = new Random().ints(length, 0, 10).toArray();
		SortingAlgorithm shells = new ShellSort();
		alg.add(shells);
		/*SortingAlgorithm qs = new QuickSort();
		alg.add(qs);
		SortingAlgorithm bs = new BubbleSort();
		alg.add(bs);
		SortingAlgorithm ss = new SelectionSort();
		alg.add(ss);
		SortingAlgorithm is = new InsertionSort();
		alg.add(is);
		SortingAlgorithm ms = new MergeSort();
		alg.add(ms);
		*/
	}
	
	public static void main(String[] args) {
		
		SortingManager sm = new SortingManager(10);
		String[] winner = {null, null};
		
		System.out.println("Input: " + Arrays.toString(sm.input));
		
		
		for (SortingAlgorithm a: sm.alg) {
			long startTime = System.nanoTime();
			
			int[] inp = sm.input.clone();
			int[] sorted = a.sort(inp);
			
			long endTime = System.nanoTime();
			long duration = (endTime - startTime); //divided by 1000000 to get milliseconds.
			
			if(winner[0] == null || Integer.valueOf(winner[1]) > duration) {
				winner[0] = a.toString(); //name of the winner sorting algorithm
				winner[1] = String.valueOf(duration);
			}
				
			System.out.println("Sorted by " + a.toString() + ": " + Arrays.toString(sorted) + 
					"\nDuration: " + duration + " nanoTics");
		};
		
		
		System.out.println("\nThe winning algorithm is " + winner[0] + " taking only " + winner[1] + " nanoTics");
		
		
		
	}
	
}
