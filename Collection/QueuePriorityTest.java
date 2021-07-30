package com.sourabhproject.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class QueuePriorityTest {

	public static void main(String[] args) {
		Queue l = new PriorityQueue();

		l.add(12);
		l.add(344);
		l.add(55);
		l.add(56);
		l.add(8);
		
		l.offer(12);
		
		l.poll();
		
		l.remove();
		
		System.out.println(l.peek());
		
		System.out.println(l.size());

		System.out.println(l);

		
	}

}
