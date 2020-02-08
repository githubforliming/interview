package com.freeedu.p0207;

/**
 * 反转链表
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
		
	
		ListNode res = reverseBetween(head, 1,2);
		while(res !=null) {
			System.out.println(res.val);
			res = res.next;
		}
		
	}
	/**
	 * 输入: 1->2->3->4->5->NULL 
	 * 输出: 5->4->3->2->1->NULL
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
	 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4 1 ≤ m ≤ n ≤ 链表长度。 
	 * 输出: 1->4->3->2->5->NULL
	 * 
	 * @param head
	 * @return
	 */
	public static  ListNode reverseBetween(ListNode head, int m, int n) {
		// n的前一个节点
		ListNode firstPrv = null;
		for (int i=1;i<m;i++) {
			if (i == 1) {
				firstPrv = head;
			} else {
				firstPrv = firstPrv.next;
			}
		}
		// 第n个 next设置为null
		ListNode pre = null; //
		// firstPrv == null 也就是第一个的前一个
		// nowNode（其实就是第n个元素）2
		ListNode nowNode = firstPrv == null ? head : firstPrv.next;
		// 当前操作node的下一个
		ListNode next = null;	
		
		// n-m 反转  也就是第n+1 到第m个(包含) 反转
		for (int i = m; i <=n; i++) {
			// 获取3 
			next = nowNode.next;
			// 2的next是null 3的next是2   
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
			// m是1
			head.next = next;
			return pre;
		}
		return head;
	}
	
	/**
	 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4 1 ≤ m ≤ n ≤ 链表长度。 
	 * 输出: 1->4->3->2->5->NULL
	 * 在头前边 创建一个虚拟节点  Nodex->1->2->3->4->5->NULL
	 * @param head
	 * @return
	 */
	public static  ListNode reverseBetween2(ListNode head, int m, int n) {
		ListNode fixed = new ListNode(0);
		fixed.next = head;
		ListNode firstPre =fixed;
		
		// 找到第m个元素的前一个 让firstPre指向前一个 如果m是1 那firstPre 就是新建的Node(0)
		for (int i=1;i<m;i++) {
			firstPre = firstPre.next;
		}
		
		// 然后反转m到第n个的next
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
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
