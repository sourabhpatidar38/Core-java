package com.sourabhproject.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();
		
		d.addFirst("Sourabh");
		d.addLast(9);
		d.add("gg gaming");
		d.add("Suyash");
		d.add("Nikhil");
		d.add("Puniya Dada");
		d.add("brahma gaming");
		d.offerFirst(1);
		d.offerLast(10);
		
		d.removeFirst();
		d.removeLast();
		
		d.pollFirst();
		d.pollLast();
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
		System.out.println(d);
	}

}
