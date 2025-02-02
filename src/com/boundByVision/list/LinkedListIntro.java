package com.boundByVision.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIntro {
	 public static void main(String[] args) throws Exception {
		 List<Integer> li = new LinkedList<Integer>();
		 li.add(10);
		 li.add(20);
		 li.add(30);
		 li.add(40);
		 System.out.println(li);
		 System.out.println(li.get(2));
		 System.out.println(li.hashCode());	 
		 System.out.println(li.size());	
		 
		 CustomLinkedList cl = new CustomLinkedList();
		 cl.add(20);
		 cl.add(30);
		 cl.add(40);
		 cl.add(50);
		 cl.add(60);
		 cl.get(4);
		 
		 System.out.println(cl);
	 }
}
