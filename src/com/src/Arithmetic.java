package com.src;

import java.util.function.BiFunction;

public class Arithmetic {

	public static int add(int i,int j)
	{
		return i+j;
	}

}


class MethodRerferenceEx
{
public static void main(String[] args) {
	
	BiFunction<Integer,Integer,Integer> bi=Arithmetic::add;
	
	System.out.println(bi.apply(56, 45));
	
}	
}


