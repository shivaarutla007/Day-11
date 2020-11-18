package com.src;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		TreeSet<Integer> ts=new TreeSet<>(				
//			new Comparator() {
//				@Override
//				public int compare(Object o1, Object o2) {
//					Integer i=(Integer)o1;
//					Integer j=(Integer)o2;
//					if(i<j)
//					{
//						return 1;
//					}
//					else
//					{
//						return -1;
//					}
//					
//				}}
//				
//				);
		
		
		

		TreeSet<Integer> ts=new TreeSet<>((Object o1, Object o2)-> {
					Integer i=(Integer)o1;
					Integer j=(Integer)o2;
					if(i<j)
					{
						return 1;
					}
					else
					{
						return -1;
					}}
			
				
				);
		
		ts.add(67);
		ts.add(23);
		ts.add(56);
		ts.add(12);
		ts.add(34);
		ts.add(90);
		
		System.out.println(ts);

	}
	

}
