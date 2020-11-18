package com.src;

interface Remote{
	
	SomeThing getRemote(String r);
}

class SomeThing{
	
	String str;

	public SomeThing(String str) {
		
		System.out.println(str);
	}
	
}

public class ConstructorRefEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Remote r=SomeThing::new;
		
		r.getRemote("hello everyone");

	}

}
