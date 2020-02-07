package com.freeedu.p0206;

import java.util.Arrays;

/**
 * �鲢���� java�ڲ�ʹ��
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
		// �������
		sort(arr, left, mid);
		// �ұ�����
		sort(arr, mid + 1, right);
		// �ϲ�����
		merge(arr, left, mid + 1, right);
	}

	/**
	 * �ϲ�
	 * 
	 * @param arr
	 * @param leftP  ��ʼָ��
	 * @param rightP �ҿ�ʼָ��
	 * @param rightB �ұ߽�
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
