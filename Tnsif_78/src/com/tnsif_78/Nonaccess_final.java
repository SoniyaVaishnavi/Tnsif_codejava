package com.tnsif_78;

public class Nonaccess_final {
	
			
		final int num=30;
		
		void show() {
			System.out.println("the value of num is :" + num);
		}
			


public static void main(String[] args) {
	Nonaccess_final d=new Nonaccess_final();
	d.show();
	//d.num=50;


	
}
}






