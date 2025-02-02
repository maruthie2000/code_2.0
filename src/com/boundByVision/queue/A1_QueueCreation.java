package com.boundByVision.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class A1_QueueCreation {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		//Follows natural sort order
		System.out.println("queue elements: "+q);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
		
		Queue<Integer> qq = new ArrayDeque<Integer>();
		for(int i=0; i<=5; i++) {
			qq.add(i);
		}
		System.out.println(qq);
		System.out.println(qq.peek());
		System.out.println(qq.poll());
		System.out.println(qq);
	
	}
}
