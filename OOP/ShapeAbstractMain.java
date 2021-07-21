package com.sourabhproject.oop;

public class ShapeAbstractMain {

	public static void main(String[] args) {
		

		ShapeAbstract s = new CircleAbstract(5);
		
		s.setBorderWidth(8);
		s.setColor("Red");
		
		double d1 = s.area();
		
		System.err.println("______Circle_____");
		System.out.println("Color : "+s.getColor());
		System.out.println("BorderWidth : "+s.getBorderWidth());
		System.out.println("Area of Circle : "+d1);
		System.out.println(s.area());
		
        ShapeAbstract s1 = new RectangleAbstract(33,44);
		
		s1.setBorderWidth(8);
		s1.setColor("Red");
		
		double d2 = s1.area();
		
		{System.err.println("_____Rectangle_______");}
		System.out.println("Color : "+s1.getColor());
		System.out.println("BorderWidth : "+s1.getBorderWidth());
		System.out.println("Area of Rectangle : "+d2);
		
		
		  ShapeAbstract s2 = new TriangleAbstract(8, 8);
		  
		  s2.setBorderWidth(8); s2.setColor("Red");
		  
		  double d3 = s2.area();
		  
		  {System.err.println("_______Triangle_______");}
		  System.out.println("Color : "+s2.getColor());
		  System.out.println("BorderWidth : "+s2.getBorderWidth());
		  System.out.println("Area of Triangle : "+d3);
		 
	}

}
