package com.freeedu.p0207;

/**
 * 字符串反转 reverseString( 
 * 字符串带要求反转 reverseStringk( 
 * 整数反转 reverseInt(
 * 
 * @author LM
 *
 */
public class Fzzfc {
	public static void main(String[] args) {
		// String str =
		// "krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
		// System.out.println(reverseStringk(str,20));
		//System.out.println(reverseInt3(-123));
		int i=-123;
		System.out.println(i/10);
	}

	// 简单反转字符串
	public static String reverseString(String str) {
		char[] arr = str.toCharArray();
		reverseChar(arr);
		return new String(arr);
	}

	public static void reverseChar(char[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			char tmp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = tmp;
		}
	}

	// 指定条件反转字符串
	// 给定一个字符串和一个整数 k，
	// 你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
	// 如果剩余少于 k 个字符，则将剩余的所有全部反转。
	// 如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，
	// 并将剩余的字符保持原样。
	public static String reverseStringk(String s, int k) {
		char[] arr = s.toCharArray();
		// 一共需要反转几个2k 次
		int count = arr.length / (2 * k);
		for (int i = 0; i < count; i++) {
			reverseChar(arr, 2 * k * i, k);
		}
		// 最后几个反转
		int last = arr.length - 2 * k * count;
		if (last >= k) {
			reverseChar(arr, 2 * k * count, k);
		} else {
			// 剩余全部反转
			reverseChar(arr, 2 * k * count, last);
		}

		return new String(arr);
	}

	/**
	 * 从第start 开始 反转len个字母
	 * 
	 * @param arr
	 * @param startlen
	 * @param len
	 */
	private static void reverseChar(char[] arr, int start, int len) {
		int end = start + len - 1;// 2
		for (int i = 0; i < len / 2; i++) {
			char c = arr[end - i];
			arr[end - i] = arr[start + i];
			arr[start + i] = c;
		}
	}

	/**
	 * 反转整数 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	 * 
	 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
	 */
	private static int reverseInt(int x) {
		// 123
		// 是否是负数
		boolean isF = false;
		if (x < 0) {
			isF = true;
			x = 0 - x;
		}
		//
		long[] arr = new long[32];
		int i = 0;
		while (x > 0) {
			arr[i++] = x % 10;
			x = x / 10;// 去除1位
		}

		// i 表示位数
		long base = 1;
		Long res = 0L;
		for (int j = i - 1; j >= 0; j--) {
			res += arr[j] * base;
			base = base * 10;
		}
		if (isF)
			res = -res;
		if (res > Math.pow(2, 31) - 1 || res < 0 - Math.pow(2, 31)) {
			return 0;
		}
		return res.intValue();
	}

	/**
	 * 反转整数 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	 * 
	 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
	 */
	private static int reverseInt2(int x) {
		String str = String.valueOf(x);
		char[] cs = str.toCharArray();
		boolean f = cs[0] == '-' ? true : false;

		int len = cs.length;
		Long res = 0L;
		long base = 1;
		// 从第几位开始
		int start = f ? 1 : 0;
		for (int i = start; i < len; i++) {
			int in = cs[i] - 48;
			res += in * base;
			base = base * 10;
		}
		if (f)
			res = -res;
		if (res > Math.pow(2, 31) - 1 || res < 0 - Math.pow(2, 31)) {
			return 0;
		}
		return res.intValue();
	}

	/**
	 * 反转整数 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	 * 
	 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
	 */
	private static int reverseInt3(int x) {
		String str = String.valueOf(x);
		int base = 1;
		if ("-".equals(str.substring(0, 1))) {
			str = str.substring(1);
			base = -1;
		}
		char[] cs = str.toCharArray();
		reverseChar(cs);
		Long res = Long.valueOf(new String(cs));
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
			return 0;
		}
		return res.intValue() * base;
	}

	/**
	 * 反转整数 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	 * 
	 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
	 */
	private static int reverseInt4(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10	;
			x /= 10;
			// 判断最大值           最小              						     // 2147483647/10 && 
			if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
				return 0;
			// 0+1 1*10+2 12*10+3   123 
			rev = rev * 10 + pop;
		}
		return rev;
	}
}
