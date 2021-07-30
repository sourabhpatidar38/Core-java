package com.sourabhproject.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new Vector();

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
