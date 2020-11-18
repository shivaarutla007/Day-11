package com.src;

import java.util.ArrayList;
import java.util.Collections;

public class MethodrefEx {

	public static void main(String[] args) {
	
		
		Greeting g=SomeClass::display;
		
		g.mrng();
		
		
		
		ArrayList al=new ArrayList();
		
		al.add(23);
		al.add(45);
		al.add(13);
		
		
		al.forEach((y)->System.out.println(y));
		
		al.forEach(System.out::println);
		
		al.forEach((c)->System.out.println(c));
		
		
		

	}

}
