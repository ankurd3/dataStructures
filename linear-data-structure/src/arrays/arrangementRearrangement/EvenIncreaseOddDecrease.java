package arrays.arrangementRearrangement;

import java.util.Arrays;

import arrays.Util;

/*
Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.

Examples:

Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
Output : 4 5 3 6 2 7 1

Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
Output : 4 5 2 6 1 8 1 8
*/

//Time Complexity : O(nlogn)
//Space : O(n)

public class EvenIncreaseOddDecrease {
	public static void main(String[] args) {
		//int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		 int[] arr = {1, 2, 1, 4, 5, 6, 8, 8};
		evenIncreaseOddDecreasearrange(arr);
	}

	public static void evenIncreaseOddDecreasearrange(int[] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		int pivotIndex = (int) size / 2;
		int i = size - pivotIndex - 1;
		int j = i + 1;
		int[] resultArr = new int[size];
		for (int k = 0; k < size; ++k) {
			if (i >= 0) {
				resultArr[k] = arr[i];
				--i;
				++k;
			}
			if (j < size) {
				resultArr[k] = arr[j];
				++j;
			}
		}
		Util.displayArr(resultArr);
	}
}
