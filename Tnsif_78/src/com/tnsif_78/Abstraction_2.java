package com.tnsif_78;

public class Abstraction_2 extends Abstraction_1{
	
public  void apple() {
	System.out.println("the fruit is apple");

}

public static void main(String[] args) {
	Abstraction_1 a=new Abstraction_2();
	a.apple();
}

}
