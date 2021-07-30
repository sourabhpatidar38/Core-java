package com.sourabhproject.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class QuesFive {

	public List<List<Integer>> getRandomNumber(List<Integer> a, int n) {
		Random r = new Random();
		ArrayList<List<Integer>> nl = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			int rd = r.nextInt(a.size());
			nl.add(a);
			

		}
		return nl;

	}

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		for (int i = 0; i < 10000; i++) {
			a.add(i);

		}
		
		System.out.println(a);
		
		QuesFive s = new QuesFive();
		System.out.println(s.getRandomNumber(a, 50));
		
		 
		
		
		 

	}
}