package com.sourabhproject.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		List l = new ArrayList();

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
		System.out.println(" ");

		List l1 = new ArrayList();

		l1.add(12);
		l1.add(13.44);
		l1.add("lava");
		l1.add(14.55f);
		l1.add('z');
		//l1.addAll(l);
		
		System.out.println(l1);
		
		l1.remove(3.44);
		
		System.out.println(l1);
		
		l1.retainAll(l);
		
		System.out.println(l1);

		System.out.println(l1.isEmpty());
		
		System.out.println(l1.contains(12));
		
		System.out.println(l.containsAll(l1));
		
	}

}
