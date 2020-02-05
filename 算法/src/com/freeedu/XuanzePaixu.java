package com.freeedu;

import java.util.Arrays;

/**
 * 选择排序 时间复杂度 O(n²)
 * 空间复杂度 O(1)
 * @author LM
 *
 */
public class XuanzePaixu {
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,3,1,0,44,22,11};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	 static void sort(int[] arr) {
							// length - 1
		for (int i = 0; i < arr.length-1; i++) {
			int minPos = i;
			for (int j = i+1; j < arr.length; j++) {
				minPos = arr[j] < arr[minPos] ? j : minPos;
			}
			// 换位置
			swap(arr,i,minPos);
		}
	}

	 static void swap(int[] arr, int i, int minPos) {
		int tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;
			
	}
}
