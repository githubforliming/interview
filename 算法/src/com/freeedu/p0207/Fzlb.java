package com.freeedu.p0207;

import java.util.HashSet;
import java.util.Set;

/**
 * 反转链表
 * reverseList( 反转链表
 * reverseBetween 反转指定位置m n之间的链表
 * swapPairs（ 两两反转  1->2->3->4->null ==> 2->1->4->3
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
	
	// 链表两两交换
	public static ListNode swapPairs(ListNode head) {
		// 如果链表是空 直接返回
		if(head == null) return head;
		// 交换第一个 
		ListNode f = head;
		// 交换第二个
		ListNode s = head.next;
		// 最后返回节点
		ListNode res = head;
		// 上一组最后一个节点
		ListNode last = new ListNode(0);
		if (s != null) {
			res = s;
		}
		// 
		while(f != null && s != null) {
			// 把上一组末尾指针指向这一组的第二个节点（交换后第一个）
			last.next = s;
			// 交换位置
			f.next = s.next;
			s.next = f;
			// 重新赋值 
			last = f;
			f = f.next;
			s = f == null ? null : f.next;
			
		}
		return res;
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
	
	
	/**
	 * 判断链表是否有环 
	 * 暴力破解
	 * @param head
	 * @return
	 */
	public static  boolean   hascycle1(ListNode head) {
		// 3000 给定一个时间
		long start = System.currentTimeMillis();
		while (head != null && (System.currentTimeMillis()-start) <3000) {
			head = head.next;
		}
		if (head == null) return true;
		return false;
	}
	
	/**
	 * 判断链表是否有环 
	 * 用一个set把已经遍历的放进去 判断 如果下次放的时候已经存在 说明是环
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
	 * 判断链表是否有环 
	 * 龟兔赛跑式 快指针 慢满指针 
	 * @param head
	 * @return
	 */
	public static  boolean   hascycle3(ListNode head) {
		// 快指针
		ListNode fast= head;
		// 慢指针
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
