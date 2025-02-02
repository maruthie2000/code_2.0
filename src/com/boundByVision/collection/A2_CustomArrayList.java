package com.boundByVision.collection;

import java.util.Arrays;
import java.util.Iterator;

public class A2_CustomArrayList {

	Object[] a = null;
	int index = 0;

	A2_CustomArrayList() {
		a = new Object[10];
	}

	A2_CustomArrayList(int size) {
		a = new Object[size];
	}

	public void add(Object obj) {
		if (index > a.length) {
			int newSize = a.length + (a.length / 2);
			a = Arrays.copyOf(a, newSize);
		}
		a[index] = obj;
		index++;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null)
				s.append("");
			s.append(a[i] + ",");
		}
		s.append("]");
		return s.toString();
	}

	public void check() throws Exception {
		if (index<0 || index>a.length) {
			throw new Exception("Index Not Found");
		}
	}
	
	public Object get(int index) throws Exception {
		check();
		return a[index];
	}
}
