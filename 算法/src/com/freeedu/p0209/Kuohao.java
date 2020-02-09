package com.freeedu.p0209;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 括号
 * 
 * @author LM
 *
 */
public class Kuohao {
	public static void main(String[] args) {
		// 判断
		String s= "()";
		new Kuohao().isValid(s);
	}

	/**
	 * 判断括号是否合法 
	 * @param s
	 * @return
	 */
		public boolean isValid(String s) {
			Stack<Character> sta = new Stack<>();
			Map<Character,Character> map = new HashMap<>();
			map.put(')','(');
			map.put(']','[');
			map.put('}','{');
			char[] arr = s.toCharArray();
			for (int i=0;i<arr.length;i++) {
				char c = arr[i];
				// 不是有括号 放到栈里边
				if (!map.containsKey(c)) {
					sta.add(c);
				} else if (sta.size() == 0 || map.get(c) != sta.pop()) {
					return false;
				}
			}
			if (sta.size() == 0) return true;
			return false;
		}
		
		/**
		 * 判断括号是否合法 时间复杂度太高  
		 * @param s
		 * @return
		 */
		public boolean isValid2(String s) {
			// 从里到外 把匹配的括号消掉 
			int len;
			do {
				len = s.length();
				s = s.replace("()", "").replace("[]", "").replace("{}", "");
			}while(len != s.length());
			
			return s.length() == 0;
		}
}
