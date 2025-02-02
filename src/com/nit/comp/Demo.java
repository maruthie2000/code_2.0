package com.nit.comp;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(1);
		System.out.println("Array Before sort...");
		System.out.println(al);
		System.out.println("Array After sort...");
	    Collections.sort(al);
	    System.out.println(al);
	    Collections.reverse(al);
	    System.out.println("Array Reverse...");
	    System.out.println(al );
 	}
}
