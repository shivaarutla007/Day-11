package com.src;


public interface InterfaceEight {

	
	public void run();
	public void eat();
	
	default void kick() {
		
		System.out.println("kick everone except shiva sir");
	}
	
	public static void service() {
		
		System.out.println("this is static method.");
		
	}
	
	
}
