package com.sourabhproject.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkHashSetTest {
	
	public static void main(String[] args) {
		Set l = new LinkedHashSet();

		l.add(12);
		l.add(3);
		l.add(44);
		l.add(455);
		l.add(55);
		
		System.out.println(l.size());

		System.out.println(l);
	}

}
