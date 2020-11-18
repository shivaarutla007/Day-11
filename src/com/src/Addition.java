package com.src;

public class Addition implements FunctInterface {

	@Override
	public void calc(int a, int b) {
	
		
		System.out.println("addition ="+(a+b));

	}

}

class Subtraction implements FunctInterface{
	@Override
	public void calc(int a, int b) {
	
		
		System.out.println("subtraction ="+(a-b));

	}
}




class Multiplication implements FunctInterface{
	@Override
	public void calc(int a, int b) {
	
		
		System.out.println("Multiplication ="+(a*b));

	}
	
}

class Division implements FunctInterface{
	
	@Override
	public void calc(int a, int b) {
	
		
		System.out.println("Division ="+(a/b));

	}
}

