package com.freeedu;

import java.util.Arrays;
import java.util.Random;

import com.freeedu.p0206.GuiBingPaiXu;

/**
 * 算法校验
 * @author LM
 *
 */
public class CheckData {
	
	public static void main(String[] args) {
		 if (check(1000, 400)) {
			 System.out.println("对着呢");
		 } else {
			 System.out.println("错了啊");
		 }
	}
	/**
	 * 
	 * @param max 随机数个数
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
	 * @param count 校验的次数
	 * @param max 数组大小
	 * @return
	 */
	public static boolean check(int count,int max) {
		boolean res = true;
		end: for (int i = 0; i < count; i++) {
			int[] arr = getArr(max);
			int[] arrcp = new int[max];
			System.arraycopy(arr, 0, arrcp, 0, arr.length);
			// 系统函数的排序 这个结果是对的
			Arrays.sort(arrcp);
			// 自己写的排序 这个结果要跟系统函数排序结果比较
			GuiBingPaiXu.sort(arr,0,arr.length-1);
			// 循环进行比较 
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
