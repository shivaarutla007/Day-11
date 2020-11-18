package com.src;
import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner name = new StringJoiner("-","[","]");
		
		name.add("pavitra");
		name.add("vaishnavi");
		name.add("vinodhini");
		name.add("muskan");
		name.add("anusha");
		
		System.out.println(name);
		
		System.out.println(name.length());
		
		String s=name.toString();
		char c=s.charAt(3);
		
		

	}

}
