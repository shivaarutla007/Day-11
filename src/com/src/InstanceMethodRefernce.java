package com.src;
interface Some{	
	public void dis();
}

class InstanceRef{	
	public void run()
	{
		System.out.println("run raja run");
	}
}
public class InstanceMethodRefernce {

	public static void main(String[] args) {
		
		
	InstanceRef inr=new InstanceRef();
	
	
	Some s=inr::run;
	
s.dis();
	
	
	

	}

}
