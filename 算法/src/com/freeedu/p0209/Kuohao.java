package com.freeedu.p0209;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * ����
 * 
 * @author LM
 *
 */
public class Kuohao {
	public static void main(String[] args) {
		// �ж�
		String s= "()";
		new Kuohao().isValid(s);
	}

	/**
	 * �ж������Ƿ�Ϸ� 
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
				// ���������� �ŵ�ջ���
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
		 * �ж������Ƿ�Ϸ� ʱ�临�Ӷ�̫��  
		 * @param s
		 * @return
		 */
		public boolean isValid2(String s) {
			// ���ﵽ�� ��ƥ����������� 
			int len;
			do {
				len = s.length();
				s = s.replace("()", "").replace("[]", "").replace("{}", "");
			}while(len != s.length());
			
			return s.length() == 0;
		}
}
