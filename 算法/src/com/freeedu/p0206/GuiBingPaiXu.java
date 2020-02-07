package com.freeedu.p0206;

import java.util.Arrays;

/**
 * 归并排序 java内部使用
 * 
 * @author LM
 *
 */
public class GuiBingPaiXu {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 8, 3, 6, 9 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public  static void sort(int[] arr, int left, int right) {
		if (left == right)
			return;
		int mid = left + (right - left) / 2;
		// 左边排序
		sort(arr, left, mid);
		// 右边排序
		sort(arr, mid + 1, right);
		// 合并左右
		merge(arr, left, mid + 1, right);
	}

	/**
	 * 合并
	 * 
	 * @param arr
	 * @param leftP  左开始指针
	 * @param rightP 右开始指针
	 * @param rightB 右边界
	 */
	private static void merge(int[] arr, int leftP, int rightP, int rightB) {
		int leftStart = leftP;
		int mid = rightP - 1;
		int[] tmp = new int[rightB - leftP + 1];
		int k = 0;
		while (leftP <= mid && rightP <= rightB) {
			tmp[k++] = arr[leftP] <= arr[rightP] ? arr[leftP++] : arr[rightP++];
		}
		while (leftP <= mid)
			tmp[k++] = arr[leftP++];
		while (rightP <= rightB)
			tmp[k++] = arr[rightP++];
		for (int i = 0; i < tmp.length; i++)
			arr[leftStart + i] = tmp[i];
	}
}
