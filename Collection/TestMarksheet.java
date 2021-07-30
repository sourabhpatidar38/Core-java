package com.sourabhproject.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Sourabh Patidar
 * Test Program For {@link Comparable} and {@link Comparator}
 */
public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m = new Marksheet();
		m.setRollNo("1");
		m.setFname("Sourabh");
		m.setLname("Patidar");
		m.setMaths(55);
		m.setChem(56);
		m.setPhy(88);
		
		Marksheet m1 = new Marksheet();
		m1.setRollNo("3");
		m1.setFname("Sourabh");
		m1.setLname("Jain");
		m1.setMaths(56);
		m1.setChem(66);
		m1.setPhy(89);
		
		Marksheet m2 = new Marksheet();
		m2.setRollNo("2");
		m2.setFname("Ankit");
		m2.setLname("Sharma");
		m2.setMaths(45);
		m2.setChem(76);
		m2.setPhy(78);
		
		Marksheet m3 = new Marksheet();
		m3.setRollNo("5");
		m3.setFname("Suyash");
		m3.setLname("Singh");
		m3.setMaths(90);
		m3.setChem(97);
		m3.setPhy(95);
		
		Marksheet m4 = new Marksheet();
		m4.setRollNo("4");
		m4.setFname("Sourabh");
		m4.setLname("Chawar");
		m4.setMaths(35);
		m4.setChem(34);
		m4.setPhy(33);
		
		Marksheet m5 = new Marksheet();
		m5.setRollNo("6");
		m5.setFname("Bablu");
		m5.setLname("Don");
		m5.setMaths(35);
		m5.setChem(34);
		m5.setPhy(33);
		
		ArrayList<Marksheet> a = new ArrayList<Marksheet>();
		
		a.add(m);
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m5);
		{System.err.println("BY ROLL NUMBER");}
		Collections.sort(a);
		Iterator<Marksheet> i = a.iterator();
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Marksheet ms = (Marksheet) iterator.next();
			System.out.println(ms.getRollNo()+" "+ms.getFname()+" "+ms.getLname()+" "+ms.getMaths()+" "+ms.getChem()+" "+ms.getPhy());
		}
		{System.err.println("BY FNAME AND LNAME");}
		
		Collections.sort(a, new OrderByFname());
		
		Iterator<Marksheet> e = a.iterator();
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Marksheet me = (Marksheet) iterator.next();
			System.out.println(me.getRollNo()+" "+me.getFname()+" "+me.getLname()+" "+me.getMaths()+" "+me.getChem()+" "+me.getPhy());

		}
		{System.err.println("BY MATHS");}
        Collections.sort(a, new OrderByMaths());
		
		Iterator<Marksheet> h = a.iterator();
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Marksheet mh = (Marksheet) iterator.next();
			System.out.println(mh.getRollNo()+" "+mh.getFname()+" "+mh.getLname()+" "+mh.getMaths()+" "+mh.getChem()+" "+mh.getPhy());

		}
		
	}

}
