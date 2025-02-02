package com.nit.comp;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "maru", 3));
		al.add(new Student(106,"yogi",5));
		al.add(new Student(104,"chaya",1));
		al.add(new Student(105,"Sachii",42));
		al.add(new Student(102,"tanu",8));
	     //	Collections.sort(al); Student class not implementing Comparable interface
	    //System.out.println(al);
		for(Student st : al) {
			System.out.println(st);
		}
		System.out.println("Sorting after Student class implements Comparable interface");
		Collections.sort(al);
		for(Student st : al) {
			System.out.println(st);
		}
	}
}
