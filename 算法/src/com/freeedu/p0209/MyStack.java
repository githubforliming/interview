package com.freeedu.p0209;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈 q 放元素 tmp中间转换 放入元素x 先把q的元素放到tmp中 再把x 放入q中 再把tmp中元素放到q中 这样后进的元素就会先出去
 * 
 * @author LM
 *
 */
public class MyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(1);
		ms.push(2);
		System.out.println(ms.pop());
	}
	Queue<Integer> q;
	Queue<Integer> tmp;

	/** Initialize your data structure here. */
	public MyStack() {
		q = new LinkedList<>();
		tmp = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		if (q.size() > 0) {
			while (q.peek() != null) {
				tmp.add(q.poll());
			}
			q.add(x);
			while (tmp.peek() != null) {
				q.add(tmp.poll());
			}
		} else {
			q.add(x);
		}

	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return q.poll();
	}

	/** Get the top element. */
	public int top() {
		return q.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return q.size() == 0;
	}
}
