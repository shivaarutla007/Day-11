package com.src;

public class InterfaceMain implements InterfaceEight{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMain im=new InterfaceMain();
		im.run();
		im.eat();
		im.kick();
		
		InterfaceEight.service();
		
	}

	@Override
	public void run() {
		System.out.println("run raja run");
		
	}

	@Override
	public void eat() {
		
		System.out.println("eat what ever you want");
		
	}
	
	@Override
	public void kick() {
		
		System.out.println("kick everone except shiva sir");
	}

}
