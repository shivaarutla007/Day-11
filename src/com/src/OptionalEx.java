package com.src;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]=new String[4];
		
		str[0]="SHIVA";
		str[1]="KUMAR";
		
		str[3]="YYYY";
		for(int i=0;i<4;i++)
		{
		Optional<String> cknull=Optional.ofNullable(str[i]);
		if(cknull.isPresent())
		{
			System.out.println(str[i].toLowerCase());
		}
		else
		{
			System.out.println("string is not there");
		}
		
		
		
		
		
		}
		
		System.out.println(str[2].toLowerCase());
	
		
		
		

	}

}
