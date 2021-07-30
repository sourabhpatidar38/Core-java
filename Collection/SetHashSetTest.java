package com.sourabhproject.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetHashSetTest {

	public static void main(String[] args) {
		
		Set l = new HashSet();

		l.add(12);
		l.add(3.44);
		l.add("Java");
		l.add(4.55f);
		l.add('A');
		
		System.out.println(l.size());

		System.out.println(l);

	}
}
