package com.nit.arraylist;

import java.util.Arrays;

public class CustomArrayList {
	Object[] a = null;
	int index = 0;

	CustomArrayList() {
		a = new Object[10];
	}

	CustomArrayList(int size) {
		a = new Object[size];
	}

	public void add(Object obj) {
		if (index > a.length) {
			int newsize = (a.length + a.length / 2);
			a = Arrays.copyOf(a, newsize);
		}
		a[index] = obj;
		index++;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < a.length; i++) {
			if ((i - 1) == (a.length - 1))
				sb.append(a[i]);

			else
				sb.append(a[i] + ",");
		}
		sb.append("]");
		return sb.toString();
	}

	public void check() throws Exception {
		if (index < 0 || index > a.length) {
			throw new Exception("Index not found..");
		}
	}

	public Object get(int index) throws Exception {
		check();
		return a[index];
		
	}
	
	public int size() {
		return a.length;
	}
	
	public Object remove(int index) throws Exception {
		check();
		Object obj = get(index);
		int noOfShiftOperations = a.length - index - 1;
		if(noOfShiftOperations>0) {
			System.arraycopy(a, index+1, a, index, noOfShiftOperations);
			/*
			 * System.arraycopy(a, 2+1, a, 2, 2); System.arraycopy(a, 3+1, a, 3, 2);
			 */
		}
		a[--index]=null;
			
			return obj;
		
	}
}
