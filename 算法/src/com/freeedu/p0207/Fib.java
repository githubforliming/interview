package com.freeedu.p0207;
/**
 * ì³²¨ÄÇÆõÊıÁĞ
 * @author LM
 *
 */
public class Fib {
	public static void main(String[] args) {
		System.out.println(Fibn(10));
	}

	private static int Fibn(int i) {
		 if (i == 0 || i == 1) {
			 return 1;
		 }
		 return Fibn(i-1)+Fibn(i-2);
	}
}
