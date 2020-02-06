package com.freeedu;

import java.util.Arrays;

/**
 * 插入排序 时间复杂度 O(n²) 空间复杂度 O(1) 最好时间复杂度 这个写法是O(n) 稳定的
 * 
 * @author LM
 *
 */
public class ChaRuPaiXu {
	public static void main(String[] args) {
		int[] arr = { 2,1,3,2 };

		sort2(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		// 从第二个元素开始 把他放到他该放的位置
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	static void sort2(int[] arr) {
		System.out.println(Arrays.toString(arr));
		// 1 2
		for (int i = 1; i < arr.length; i++) {
			// 从第i 开始 往前看 找合适位置
			int tmp = arr[i];
			for (int j = i; j >= 0; j--) {
				if (j>0&&tmp < arr[j - 1]) {
					arr[j] = arr[j - 1];
				} else {
					arr[j] = tmp;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
//		for (int i = 1; i < arr.length; i++) {
//			int tmp = arr[i];
//			for (int j = i; j > 0; j--) {
//				if (j > 0 && tmp < arr[j - 1]) {
//					arr[j] = arr[j - 1];
//				} else {
//					arr[j] = tmp;
//					break;
//				}
//			}
//		}
	}

	static void swap(int[] arr, int i, int minPos) {
		int tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;

	}
}
