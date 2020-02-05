package com.freeedu;

import java.util.Arrays;

/**
 * 冒泡排序 时间复杂度 O(n²) 空间复杂度 O(1)
 * 最好时间复杂度 这个写法是O(n²)
 * @author LM
 *
 */
public class MaoPaoPaixu {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8, 3, 1, 0, 44, 22, 11 };

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		//每次把最大的值 推到最后边 跟冒泡泡一样 所以是冒泡排序 
		for (int i = arr.length-1; i >0 ; i--) {
			maopaopao(arr, i);
		}
	}
	// 把最大值推到第几个位置  比如 1 2 7 2 5 3 1 maopaopao(arr,6) 就是依次冒泡 最后把5放到末尾 
	static void maopaopao (int[] arr,int i) {
		for (int j = 0; j < i; j++) {
			if(arr[j] > arr[j+1]) swap(arr, j, j+1);
		}
	}
	static void swap(int[] arr, int i, int minPos) {
		int tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;

	}
}
