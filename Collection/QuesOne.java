package com.sourabhproject.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuesOne {

	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(12);
		l.add(3.44);
		l.add("Java");
		l.add(4.55f);
		l.add('A');

		Iterator a = l.iterator();

		while (a.hasNext()) {
			Object object = (Object) a.next();
			System.out.println(object);

		}

	}

}
