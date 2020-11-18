package com.src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class ArrayListEx {

	public static void main(String[] args) {

		
		ArrayList<Student> al=new ArrayList<>();		
		Student s1=new Student(76,"yyy","uk");
		Student s2=new Student(89,"iiii","hyd");
		Student s3=new Student(23,"uuuu","bng");		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);		
		System.out.println(al);		
		Iterator it=al.iterator();	
		
		while(it.hasNext())// remove();
		{
			System.out.println(it.next());
		}
				
		for(Student s:al)
		{
			System.out.println(s);
		}
				
		al.forEach((st)->System.out.println(st));
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("sk");
		al1.add("uk");
		
		al1.forEach((sr)->System.out.println(sr));
		
		
		ArrayList al2=new ArrayList();
		
		al2.add("vaishanavi");
		
		al2.add(67);
		
		al2.forEach((ss)->System.out.println(ss));
		
		HashMap hm=new HashMap();
		
		hm.put(45,"89");
		
		hm.forEach((a,b)->System.out.println(a+"   "+b));
		
		
		
		

	}
	
	

}
