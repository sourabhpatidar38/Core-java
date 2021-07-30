package com.sourabhproject.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee implements Comparator<Employee> {

	public String name = null;
	public int salary = 0;
	
	public Employee() {}
	
	public Employee(String n,int s) {
		
		this.name = n;
		this.salary = s;
		
	}
	
	
	@Override
	public int compare(Employee o1, Employee o2) {

		return salary.compare(o1.salary);

	}

private int compare(int salary2) {
		// TODO Auto-generated method stub
		return 0;
	}

public static void main(String[] args) {
		
		List l = new ArrayList();

		l.add(17000);
		l.add(13000);
		l.add(14000);
		l.add(15000);
		l.add(12000);
		
		Collections.sort(l);
		Collections.sort(l);
		
		for (Object object : l) {
			System.out.println(object);
		}

}
}