package com.freeedu;

import java.util.Arrays;

/**
 *  希尔排序 时间复杂度 O(n²) 空间复杂度 O(1) 最好时间复杂度 这个写法是O(n) 稳定的
 * 
 * @author LM
 *
 */
public class XiErPaiXu {
	public static void main(String[] args) {
		int[] arr = { 9,6,11,3,5,12,8,7,10,15,14,4,1,13,2 };

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}
	// 9,6,11,3,5,12,8,7,10,15,14,4,1,13,2
	static void sort(int[] arr) {
		// arr.length >> 1 == arr.length/2
		for (int gap=arr.length >> 1 ;gap>0;gap = gap/2) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i; j > gap-1; j=j-gap) {
					if (arr[j] < arr[j - gap]) {
						swap(arr, j, j - gap);
					} else {
						break;
					}
				}
			}
		}
	}

		// 9,6,11,3,5,12,8,7,10,15,14,4,1,13,2
		static void sort2(int[] arr) {
			int start = 1;
			// 1 4 13 .. 
			while(start <= arr.length/3) {
				start = start*3+1;
			}
			for (int gap=start ;gap>0;gap =3*(gap-1)+1) {
				for (int i = gap; i < arr.length; i++) {
					for (int j = i; j > gap-1; j=j-gap) {
						if (arr[j] < arr[j - gap]) {
							swap(arr, j, j - gap);
						} else {
							break;
						}
					}
				}
			}
		}
	static void swap(int[] arr, int i, int minPos) {
		int tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;

	}
}
