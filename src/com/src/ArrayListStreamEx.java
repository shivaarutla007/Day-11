package com.src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ArrayListStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		System.out.println("enter number of elements to be accept :");
		int n=name.nextInt();
		
		
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("enter elements :");
		
		for(int i=0;i<n;i++)			
		{
			
			al.add((Integer)name.nextInt());
		}

		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		Iterator<Integer> it=al.iterator();
		
		while(it.hasNext())
		{
			Integer in=it.next();
			if(in%2==0)
			{
				al1.add(in);
			}
		}
		
		System.out.println(al1);
		
		//----------------------------------------------------------------------------------
		
		
		Stream s=al.stream();
		
	
		//ArrayList<Integer> l= (ArrayList<Integer>) s.filter((i)->i%2==0).collect(Collectors.toList());
			
		//System.out.println(l);
		
		List l=(List) s.filter((x)->(Integer)x%2==0).collect(Collectors.toList());
		
		System.out.println(l);
		
		
		
		
		
	}

}
