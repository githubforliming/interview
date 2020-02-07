package com.freeedu.p0207;

/**
 * ��ת����
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
		
		ListNode head =  new ListNode(3);
		head.next=new ListNode(5);
		
	
		reverseBetween(head, 1,2);
		while(head.next !=null) {
			System.out.println(head.val);
			head = head.next;
		}
		
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
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
