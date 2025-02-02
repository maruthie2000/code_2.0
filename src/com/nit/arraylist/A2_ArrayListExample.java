package com.nit.arraylist;

import java.util.ArrayList;

public class A2_ArrayListExample {
	public static void main(String[] args) {
         ArrayList<Integer> al = new ArrayList<Integer>();
         al.add(10);
         al.add(20);
         al.add(30);
         al.add(40);
         al.add(50);
         System.out.println(al);
         System.out.println(al.size());
         System.out.println(al.remove(2));
         
         
         CustomArrayList cl = new CustomArrayList();
         cl.add(10);
         cl.add(20);
         cl.add("docker build -f cutomFile -t imageone .");
         System.out.println(cl);
	}
}
