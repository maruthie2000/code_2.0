package com.boundByVision.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) throws Exception {
		CustomStackUsingArray cs = new CustomStackUsingArray();
		cs.push(10);
		cs.push(20);
		cs.push(30);
		cs.push(40);
		System.out.println(cs.peek());
		System.out.println(cs);
		cs.peek();
		cs.peek();
		cs.peek();
		cs.peek();
		cs.peek();
		System.out.println("==================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		Stack<Integer> st = new Stack<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		//Looks at the object at the top of this stack without removing it from the stack
		System.out.println(st.peek());
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st);
		st.pop();
		st.pop();
	}
}
