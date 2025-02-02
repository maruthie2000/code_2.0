package com.boundByVision.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A2_Queue {
	public static void main(String[] args) {
		Queue<String> qq = new PriorityQueue<String>();
		qq.add("Ram");
		qq.add("Sham");
		qq.add("Bham");
		
		Iterator<String> it= qq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
