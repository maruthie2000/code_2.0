package com.nit.arraylist;

import java.util.ArrayList;

public class A_ArrayList_Array {
	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println("Printing arraylist ...");
		System.out.println(al);
		System.out.println("=======================");
		Object[] objects =al.toArray();
		for(Object obj : objects) {
			System.out.print(obj+" ,");
		}
		System.out.println();
		System.out.println("=======================");
	}
}
