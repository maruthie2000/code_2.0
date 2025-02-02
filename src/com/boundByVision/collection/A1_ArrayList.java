package com.boundByVision.collection;

import java.util.ArrayList;

public class A1_ArrayList {
	public static void main(String[] args) throws Exception {
		
		//ClassName refVari = new ClassName
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.print("ArrayList Size is: ");
		System.out.println(al.size());
		System.out.println("Element at 1st position: "+al.get(1));
		try {
			System.out.println(al.get(7));
		}catch(Exception e) {
			e.getMessage();
		}
		System.out.println("Hi");
		A2_CustomArrayList cl = new A2_CustomArrayList();
		cl.add(10);
		cl.add(20);
		cl.add(30);
		cl.add(40);
		cl.add(50);
		System.out.println("Printing elements in collection: "+cl);
		System.out.println(cl.get(10));
	}
}
