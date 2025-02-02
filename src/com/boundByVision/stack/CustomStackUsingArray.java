package com.boundByVision.stack;

import java.util.Arrays;

public class CustomStackUsingArray {

	// Creating object array initilised with null;
	Object[] a = null;

	int index = 0;

	CustomStackUsingArray() {
		a = new Object[10];
	}

	CustomStackUsingArray(int index) {
		a = new Object[index];
	}

	public Object push(Object obj) {
		if (index > a.length) {
			int newsize = a.length * 2;
			a = Arrays.copyOf(a, newsize);
		}
		a[index] = obj;
		index++;
		return obj;
	}

	public Object peek() throws Exception {
		if(a.length == 0) {
			throw new Exception("EmptyStackException");
		}
		return a[a.length-1];	
		
	}
	
	public Object pop() throws Exception {
		if(a.length == 0) {
			throw new Exception("EmptyStackException..");
		}
		index = index-1;
		Object obj = a[index];
		a[index] = null;
		return obj;
		
	}
	
}
