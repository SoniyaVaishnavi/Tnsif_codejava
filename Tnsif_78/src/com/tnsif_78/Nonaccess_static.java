package com.tnsif_78;

public class Nonaccess_static {
	
	//static variable initialize
	
	static int number;
	
	//static block
	
	static {
		number=100;
		System.out.println("value created by static block :"+number);
		
	}
	static void showw() {
		System.out.println("value created by static method :"+number);
	}
	
	public static void main(String[] args) {
		System.out.println("value created by main method :"+number);
		showw();
	}

}
