package com.sourabhproject.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class OrderByFname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		if (o1.getFname().equals(o2.getFname()) == true) {
			
			return o1.getLname().compareTo(o2.getLname());
		}
		return o1.getFname().compareTo(o2.getFname());
	}

}
