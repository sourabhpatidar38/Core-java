package com.sourabhproject.collection;

//Java program select a random element from List

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExtraTest {

	// Drive Function
	public static void main(String[] args) {

		// create a list of Integer type
		List list = new ArrayList();

		// add 5 element in ArrayList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		ExtraTest obj = new ExtraTest();

		// boundIndex for select in sub list
		int numberOfElements = 50;

		// take a random element from list and print them
		System.out.println(obj.getRandomElement(list, numberOfElements));
	}

	// Function select an element base on index and return
	// an element
	public List getRandomElement(List list, int totalItems) {
		Random rand = new Random();

		// create a temporary list for storing
		// selected element
		List newList = new ArrayList();
		for (int i = 0; i < totalItems; i++) {

			// take a random index between 0 to size
			// of given List
			int randomIndex = rand.nextInt(list.size());

			// add element in temporary list
			newList.add(list.get(randomIndex));
		}
		return newList;
	}
}
