package com.sourabhproject.collection;

import java.util.Comparator;

public class OrderByLname implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
	return o1.getLname().compareTo(o2.getLname());

	}

}
