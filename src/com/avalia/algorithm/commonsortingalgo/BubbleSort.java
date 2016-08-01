package com.avalia.algorithm.commonsortingalgo;

//in one parse you will get greatest element of an array.

public class BubbleSort {
	/*
	 * 
	 * Order of execution O(n*n) proportional of (n*n)
	 * no of swap proportional to (n*n)
	 * Consider there are 10 number in array then number of swap is
	 * 9+8+7+6+5+4+3+2+1=45 which is equal to N*N/2 number of comparison.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 7, 35, 7, 299, 54, 67 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
