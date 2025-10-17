package com.tnsif_78;

class methodOL{                 //method overloading
	
	void maths(int a,int b) {
		 int c=a+b;
		 System.out.println("the addition is :"+c);
		
		}
	
	void maths(float a,float b) {
		float c=a-b;
		System.out.println("the subtraction is :"+c);
	}
	
	
	void maths(int a,int b,int c) {
		int d=a*b*c;
		System.out.println("the multiplication is :"+d);
	}
}



class methodOR{

	void home() {
		System.out.println("my home");
	}



}

class methodORdemo extends methodOR{
	void room() {
		System.out.println("my room");
	}
}
	



public class Polymorephism_demo {
	
	public static void main(String[] args) {

		methodOL m=new methodOL();              //overloading object
		m.maths(10,20);
		m.maths(220.0f,10.0f);
        m.maths(2, 3, 4);		
		
        
        
        
        
        methodORdemo d=new methodORdemo();        //overriding object
        d.room();
        d.home();

	}
	}

	
	
	
	
	
	



