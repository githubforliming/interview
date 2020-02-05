package com.freeedu;

import java.util.Arrays;

/**
 * 冒泡排序 时间复杂度 O(n²) 空间复杂度 O(1)
 * 最好时间复杂度 这个写法是O(n) 
 * @author LM
 *
 */
public class MaoPaoPaixu2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8, 3, 1, 0, 44, 22, 11 };

		sort(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		//每次把最大的值 推到最后边 跟冒泡泡一样 所以是冒泡排序 
		for (int i = arr.length-1; i >0 ; i--) {
			
			// 记录这次遍历是否有交换的数据 如果没有的话 证明已经拍好序  这个可以让最好时间复杂度变为O(n)
			boolean swaped = false;
			
			for (int j = 0; j < i; j++) {
				// 如果当前值 小于后边值 交换位置 
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swaped = true;
				}
			}
			// 如果没有交换 结束遍历
			if (!swaped) break;
		}
	}
	 
	static void sort2(int[] arr) {
		int pos = arr.length-1;
		//每次把最大的值 推到最后边 跟冒泡泡一样 所以是冒泡排序 
		for (int i = arr.length-1; i >0 ; i--) {
			// 记录这次遍历是否有交换的数据 如果没有的话 证明已经拍好序  这个可以让最好时间复杂度变为O(n)
			boolean swaped = false;
			// 如果是 1 4 2 5 7 9 10 12 24 67 90  从5开始 后边都是拍好序的 所以下次只需要遍历到5的下表即可
			int index = 0;
			// 遍历到 pos就停止 pos后边的数据已经拍好序（因为不发生swap了 ）
			for (int j = 0; j < pos; j++) {
				// 如果当前值 小于后边值 交换位置 
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swaped = true;
					index = j;
				}
			}
			// 
			pos = index;
			// 如果没有交换 结束遍历
			if (!swaped) break;
		}
	}
	
	
	static void sort3(int[] arr) {
		int pos = arr.length-1;
		//每次把最大的值 推到最后边 跟冒泡泡一样 所以是冒泡排序 
		for (int i = arr.length-1; i >0 ; i--) {
			// 记录这次遍历是否有交换的数据 如果没有的话 证明已经拍好序  这个可以让最好时间复杂度变为O(n)
			boolean swaped = false;
			// 如果是 1 4 2 5 7 9 10 12 24 67 90  从5开始 后边都是拍好序的 所以下次只需要遍历到5的下表即可
			int index = 0;
			// 遍历到 pos就停止 pos后边的数据已经拍好序（因为不发生swap了 ）
			for (int j = 0; j < pos; j++) {
				// 如果当前值 小于后边值 交换位置 
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swaped = true;
					index = j;
				}
			}
			// 
			pos = index;
			// 如果没有交换 结束遍历
			if (!swaped) break;
		}
	}
	static void swap(int[] arr, int i, int minPos) {
		int tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;

	}
}
