package com.src;

import java.util.function.BiConsumer;

public class MainLambdaEx {

	public static void main(String[] args) {
		
		
		Addition ad=new Addition();
		ad.calc(78, 22);
		
		Subtraction s=new Subtraction();
		s.calc(78,22);
		
		Multiplication m=new Multiplication();
		m.calc(3,2);
		
		Division d=new Division();
		d.calc(4, 4);
		
		
		FunctInterface add=new FunctInterface() {

			@Override
			public void calc(int a, int b) {
				System.out.println("addtion = "+(a+b));
				
			}
			
			
		};
		
		add.calc(32, 18);
		
		
		FunctInterface fi=(a,b)->System.out.println("addition = "+(a+b));
		
		fi.calc(56, 23);
				
		fi=(a,b)->System.out.println("subtraction = "+(a-b));
		
		fi.calc(56, 23);
		
		BiConsumer<Integer,Integer> bi=(a,b)->System.out.println("addition = "+(a*b));
		
		
		bi.accept(12,34);
		
		BiConsumer<String,String> bi1=(a,b)->System.out.println("addition = "+(a+b));
		
		bi1.accept("ben", "10");
		
		
		
			
			
	
		
		
		

	}

}
