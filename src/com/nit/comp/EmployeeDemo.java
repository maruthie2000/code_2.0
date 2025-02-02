package com.nit.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(21, "Maruthi", 30000.00));
		emp.add(new Employee(25, "sai", 25000.00));
		emp.add(new Employee(2, "chaya", 90000.00));
		emp.add(new Employee(6, "yogi", 50000.00));
		emp.add(new Employee(11, "Meg", 45000.00));
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		System.out.println();
		//Collections.sort(emp, new EmpIdComparator());
		Collections.sort(emp ,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				
				return e1.id - e2.id;
			}
		});
		
		System.out.println("AFTER SORT USING COMPARATOR  ...");
		
		for(Employee e : emp) {
			System.out.println(e);
		}
	}
}
