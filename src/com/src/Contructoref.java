package com.src;
interface Shape{
	
	Triangle getTriangle(String msg);
}


class Triangle
{
	String name;

	public Triangle(String name) {
		
		System.out.println("general triangle");
	}
	


}

class RightTriangle extends Triangle{

	public RightTriangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
public class Contructoref {

	public static void main(String[] args) {

		Shape s=Triangle::new;
		
		s.getTriangle("general trriangle");

	}

}
