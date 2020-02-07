package com.freeedu;

import java.util.Arrays;
import java.util.Random;

import com.freeedu.p0206.GuiBingPaiXu;

/**
 * �㷨У��
 * @author LM
 *
 */
public class CheckData {
	
	public static void main(String[] args) {
		 if (check(1000, 400)) {
			 System.out.println("������");
		 } else {
			 System.out.println("���˰�");
		 }
	}
	/**
	 * 
	 * @param max ���������
	 * @return
	 */
	public static int[] getArr(int max) {
		int[] arr = new int[max];
		Random rd = new Random();
		for(int i=0;i<max;i++) {
			arr[i] =rd.nextInt(max);
		}
		return arr;
	}
	
	/**
	 * 
	 * @param count У��Ĵ���
	 * @param max �����С
	 * @return
	 */
	public static boolean check(int count,int max) {
		boolean res = true;
		end: for (int i = 0; i < count; i++) {
			int[] arr = getArr(max);
			int[] arrcp = new int[max];
			System.arraycopy(arr, 0, arrcp, 0, arr.length);
			// ϵͳ���������� �������ǶԵ�
			Arrays.sort(arrcp);
			// �Լ�д������ ������Ҫ��ϵͳ�����������Ƚ�
			GuiBingPaiXu.sort(arr,0,arr.length-1);
			// ѭ�����бȽ� 
			for (int j=0;j<max;j++) {
				if (arr[j] != arrcp[j]) {
					System.out.println(Arrays.toString(arr));
					System.out.println(arr[j]);
					System.out.println(arrcp[j]);
					res = false;
					break end;
				}
			}
		}
		return res;
	}
}
