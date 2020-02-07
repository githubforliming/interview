package com.freeedu.p0206;

public class Digui {
	public static void main(String[] args) {
		System.out.println(f(2));
	}
	
	public static int f(int num) {
		if (num == 1) {
			return 1;
		}else {
			return num+f(num-1);
		}
	}
}
