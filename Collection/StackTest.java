package com.sourabhproject.collection;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(4);
		
		s.pop();
		
		System.out.println(s.peek());
		
		System.out.println(s);
		}

}
