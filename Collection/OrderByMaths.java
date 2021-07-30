package com.sourabhproject.collection;

import java.util.Comparator;

public class OrderByMaths implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		if (o1.getMaths()<o2.getMaths()) {
			return 1;
		}else if(o1.getMaths() == o2.getMaths()) {
			return 0;
		}else {
			return -1;
		}
	}

}
