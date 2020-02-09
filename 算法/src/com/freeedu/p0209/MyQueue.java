package com.freeedu.p0209;

import java.util.Stack;

/**
 * 用堆栈实现队列
 * @author LM
 *
 */
class MyQueue {
	public static void main(String[] args) {
		MyQueue m = new MyQueue();
		m.push(1);
		m.push(2);
		System.out.println(m.peek());
		System.out.println(m.pop());
	}
	Stack<Integer> in = new Stack<>();
	Stack<Integer> out = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if (out.size() == 0) {
    	 while(!in.isEmpty()) {
    		 out.add(in.pop());
    	 }
       }
       return out.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (out.size() == 0) {
        	while(!in.isEmpty()) {
       		 out.add(in.pop());
       	 }
        }
        return out.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.size() == 0 && out.size() ==0 ;
    }
}

 