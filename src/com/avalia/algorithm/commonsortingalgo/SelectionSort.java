package com.avalia.algorithm.commonsortingalgo;

public class SelectionSort {
	/*
	 * Order of execution O(n*n)
	 * 
	 * No of swap O(n)
	 * Remember the swaping will take place in first for loop that's why u need to track min value index from  inner array iteration.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 7, 35, 7, 299, 54, 67,0 };
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j]<=array[i]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
