package com.sourabhproject.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List l = new LinkedList();

		l.add(12);
		l.add(3.44);
		l.add("Java");
		l.add(4.55f);
		l.add('A');
		
		System.out.println(l.size());

		System.out.println(l);

		for (Object o : l) {
			System.out.println(o);
		}
}
}