package com.sourabhproject.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		SortedSet l = new TreeSet();

		l.add(12);
		l.add(344);
		l.add(55);
		l.add(56);
		l.add(8);
		
		System.out.println(l.size());

		System.out.println(l);
		
		Set l1 = new TreeSet();

		l1.add(12);
		l1.add(344);
		l1.add(55);
		l1.add(56);
		l1.add(8);
		
		System.out.println(l1.size());

		System.out.println(l1);

	}

}
