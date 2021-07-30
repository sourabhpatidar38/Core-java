package com.sourabhproject.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1, "Sourabh");
		m.put(2, "Suyash");
		m.put(3, "Navnet");
		m.put(4, "Shubham");
		m.put(5, "Lucky the Racer");
		m.put(6, "Shubham the Two");
		m.put(7, "Mayank the Dan");
		
		System.out.println("1 "+m.containsKey(8));
		
		System.out.println("2 "+m.containsValue("Navnet"));
		
		System.out.println("3 "+m.entrySet());
		
		System.out.println("4 "+m.get(6));
		
		System.out.println("5 "+m.isEmpty());
		
		System.out.println("6 "+m.keySet());
		
		System.out.println("7 "+m.put(5, "Dopaa"));
		
		System.out.println("8 "+m.remove(2));
		
		System.out.println("9 "+m.size());
		
		System.out.println("10 "+m.values());
		
		System.out.println("  ");
		
		System.out.println(m);

	}

}
