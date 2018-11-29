package dataStructures;

import java.util.Arrays;

public class Heap {

	public static int[] buildMaxHeap(int[] list) {
		for(int i = (int) Math.floor(list.length/2); i > 0; i--) {
			System.out.println("We start with number " + list[i]);
			maxHeapify(list, i);
		}
		return list;
	}
	
	public static void maxHeapify(int[] heapList, int index) {
		
		int left = getLeftChild(heapList, index);
		int right = getRightChild(heapList, index);
		

		
		int largestIndex = Integer.MIN_VALUE;
		
		if(left != -1 && heapList[left] > heapList[index]) {
			largestIndex = left;
			System.out.println("Largest is left: " + largestIndex);
		} else {
			largestIndex = index;
			System.out.println("Largest is index: " + largestIndex);
		}
		if(right != -1 && heapList[right] > heapList[largestIndex]) {
			largestIndex = right;
			System.out.println("Largest is right: " + largestIndex);
		}
		if(largestIndex != index) {
			System.out.println("Largest is not the same as index " + largestIndex + ":" + heapList[largestIndex] + " and " + index + ":" + heapList[index]);
			// swap heapList[index] and heapList[largestIndex]
			int temp = heapList[index];
			heapList[index] = heapList[largestIndex];
			heapList[largestIndex] = temp;
			
			
		}
	}
	
	public static int getLeftChild(int[] heapList,int nodeIndex) {
		int leftIndex = 2*heapList[nodeIndex]+1;
		if(leftIndex > heapList.length) {
			return -1;
		}
		return leftIndex;
	}
	
	public static int getRightChild(int[] heapList, int nodeIndex) {
		int rightIndex = 2*heapList[nodeIndex]+2;
		if(rightIndex > heapList.length) {
			return -1;
		}
		return rightIndex;
	}
	
	public static void main(String[] args) {
		int[] list = Heap.buildMaxHeap(new int[]{7, 0, 5, 6, 8, 3, 4, 2, 1});
		System.out.println(Arrays.toString(list));
	}
	
}
