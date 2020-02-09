package com.freeedu.p0207;

import java.util.HashSet;
import java.util.Set;

/**
 * ��ת����
 * reverseList( ��ת����
 * reverseBetween ��תָ��λ��m n֮�������
 * swapPairs�� ������ת  1->2->3->4->null ==> 2->1->4->3
 * 
 * @author LM
 *
 */
public class Fzlb {
	public static void main(String[] args) {
//		ListNode head =  new ListNode(1);
//		ListNode headt =  head;
//		for(int i=2;i<=5;i++) {
//			headt.next=new ListNode(i);
//			headt = headt.next;
//		}
		
//		ListNode head =  new ListNode(3);
//		head.next=new ListNode(5);
//		
//	
//		ListNode res = reverseBetween(head, 1,2);
//		while(res !=null) {
//			System.out.println(res.val);
//			res = res.next;
//		}
		long l = 1581212791927L-1581212788829L;
		System.out.println(l);
		
	}
	
	// ������������
	public static ListNode swapPairs(ListNode head) {
		// ��������ǿ� ֱ�ӷ���
		if(head == null) return head;
		// ������һ�� 
		ListNode f = head;
		// �����ڶ���
		ListNode s = head.next;
		// ��󷵻ؽڵ�
		ListNode res = head;
		// ��һ�����һ���ڵ�
		ListNode last = new ListNode(0);
		if (s != null) {
			res = s;
		}
		// 
		while(f != null && s != null) {
			// ����һ��ĩβָ��ָ����һ��ĵڶ����ڵ㣨�������һ����
			last.next = s;
			// ����λ��
			f.next = s.next;
			s.next = f;
			// ���¸�ֵ 
			last = f;
			f = f.next;
			s = f == null ? null : f.next;
			
		}
		return res;
	}


	/**
	 * ����: 1->2->3->4->5->NULL 
	 * ���: 5->4->3->2->1->NULL
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		ListNode newNext = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = newNext;
			newNext = head;
			head = tmp;
		}
		return newNext;
	}

	/**
	 * ����: 1->2->3->4->5->NULL, m = 2, n = 4 1 �� m �� n �� �����ȡ� 
	 * ���: 1->4->3->2->5->NULL
	 * 
	 * @param head
	 * @return
	 */
	public static  ListNode reverseBetween(ListNode head, int m, int n) {
		// n��ǰһ���ڵ�
		ListNode firstPrv = null;
		for (int i=1;i<m;i++) {
			if (i == 1) {
				firstPrv = head;
			} else {
				firstPrv = firstPrv.next;
			}
		}
		// ��n�� next����Ϊnull
		ListNode pre = null; //
		// firstPrv == null Ҳ���ǵ�һ����ǰһ��
		// nowNode����ʵ���ǵ�n��Ԫ�أ�2
		ListNode nowNode = firstPrv == null ? head : firstPrv.next;
		// ��ǰ����node����һ��
		ListNode next = null;	
		
		// n-m ��ת  Ҳ���ǵ�n+1 ����m��(����) ��ת
		for (int i = m; i <=n; i++) {
			// ��ȡ3 
			next = nowNode.next;
			// 2��next��null 3��next��2   
			nowNode.next = pre;
			//
			pre = nowNode;
			// nowNode = 3
			nowNode = next;
			
		}
		
		if (firstPrv != null) {
			firstPrv.next.next = next; 
			firstPrv.next = pre;
		}else {
			// m��1
			head.next = next;
			return pre;
		}
		return head;
	}
	
	/**
	 * ����: 1->2->3->4->5->NULL, m = 2, n = 4 1 �� m �� n �� �����ȡ� 
	 * ���: 1->4->3->2->5->NULL
	 * ��ͷǰ�� ����һ������ڵ�  Nodex->1->2->3->4->5->NULL
	 * @param head
	 * @return
	 */
	public static  ListNode reverseBetween2(ListNode head, int m, int n) {
		ListNode fixed = new ListNode(0);
		fixed.next = head;
		ListNode firstPre =fixed;
		
		// �ҵ���m��Ԫ�ص�ǰһ�� ��firstPreָ��ǰһ�� ���m��1 ��firstPre �����½���Node(0)
		for (int i=1;i<m;i++) {
			firstPre = firstPre.next;
		}
		
		// Ȼ��תm����n����next
		ListNode pre = null;
		ListNode now = firstPre.next;
		for (int i=m;i<=n;i++) {
			ListNode tmp = now.next;
			now.next=pre;
			pre = now;
			now = tmp;
		}
		
		firstPre.next.next=now;
		firstPre.next = pre;
		
		return fixed.next;
	}
	
	
	/**
	 * �ж������Ƿ��л� 
	 * �����ƽ�
	 * @param head
	 * @return
	 */
	public static  boolean   hascycle1(ListNode head) {
		// 3000 ����һ��ʱ��
		long start = System.currentTimeMillis();
		while (head != null && (System.currentTimeMillis()-start) <3000) {
			head = head.next;
		}
		if (head == null) return true;
		return false;
	}
	
	/**
	 * �ж������Ƿ��л� 
	 * ��һ��set���Ѿ������ķŽ�ȥ �ж� ����´ηŵ�ʱ���Ѿ����� ˵���ǻ�
	 * @param head
	 * @return
	 */
	public static  boolean   hascycle2(ListNode head) {
		Set<ListNode> old = new HashSet<>();
		while(head != null) {
			if (old.contains(head)) return true;
			old.add(head);
			head = head.next;
		}
		return false;
	}
	/**
	 * �ж������Ƿ��л� 
	 * ��������ʽ ��ָ�� ����ָ�� 
	 * @param head
	 * @return
	 */
	public static  boolean   hascycle3(ListNode head) {
		// ��ָ��
		ListNode fast= head;
		// ��ָ��
		ListNode slow = head ;
		while(fast != null &&slow != null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) return true;
		}
		
		return false;
	}
}


class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
