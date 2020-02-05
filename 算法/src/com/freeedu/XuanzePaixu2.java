package com.freeedu;

import java.util.Arrays;

/**
 * —°‘Ò≈≈–Ú
 * @author LM
 *
 */
public class XuanzePaixu2 {
	public static void main(String[] args) {
		int[] arr = {1,3,1,0};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	  static void sort(int[] arr) {
							// length - 1
		for (int i = 0; i < arr.length/2; i++) {
			int minPos = i;
			int maxPos = arr.length-1-i;
			for (int j = i; j < arr.length-i; j++) {
				minPos = arr[j] < arr[minPos] ? j : minPos;
				maxPos = arr[j] > arr[maxPos] ? j : maxPos;
			}
			// ªªŒª÷√
			if (maxPos == i || minPos == arr.length-1-i) {
				if (maxPos == minPos || (maxPos == i && minPos == arr.length-1-i)) {
					swap(arr, maxPos, minPos);
				}else if (maxPos == i) {
					swap (arr,arr.length-1-i,maxPos);
					swap(arr,i,minPos);
				}else if( minPos == arr.length-1-i) {
					swap(arr,i,minPos);
					swap (arr,arr.length-1-i,maxPos);
				} 
			} else {
				swap (arr,arr.length-1-i,maxPos);
				swap(arr,i,minPos);
			}
		}
	}

	  static void swap(int[] arr, int i, int minPos) {
		int tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;
			
	}
	  
	  
	  
	  
	   
}
