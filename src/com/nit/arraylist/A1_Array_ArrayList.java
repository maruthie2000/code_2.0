package com.nit.arraylist;

import java.util.ArrayList;

public class A1_Array_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> all = new ArrayList<Integer>();
		int[] al = new int[5];
		al[0] = 5;
		al[1] = 10;
		al[2] = 20;
		al[3] = 30;
		al[4] = 40;
		// al[5] = 50;
		for (int i = 0; i < al.length; i++) {
			all.add(al[i]);
			System.out.print(al[i] + ", ");
		}
		System.out.println();
		System.out.println("==================	");

		System.out.println(all);
	}
}
