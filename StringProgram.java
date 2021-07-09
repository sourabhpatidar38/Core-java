package com.sourabhproject.basic;

public class StringProgram {
	public static void main(String[] args) {
		String name = "Sourabh Patidar";
		
		  { System.out.println(name.length()); 
		  System.out.println(name.charAt(7));
		  System.out.println(name.indexOf("i"));
		  System.out.println(name.lastIndexOf("a"));
		  System.out.println(name.replace("a","c"));
		  System.out.println(name.replaceAll("[a-z]", "p"));
		  System.out.println(name.toUpperCase());
		  System.out.println(name.toLowerCase());
		  System.out.println(name.startsWith("patidar"));
		  System.out.println(name.endsWith("ar"));
		  System.out.println(name.substring(9)); }
		  
		 
		  
	}

}
