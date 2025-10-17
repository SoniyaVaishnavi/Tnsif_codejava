package com.tnsif_78;


public class Accessmodifier_demo {
	
	public int A=10;
	private int B=20;
	protected int C=30;
	 int Default=40;
	
	public void show() {
		System.out.println("public variable is:"+A);
		System.out.println("private variable is:"+B);
		System.out.println("protected variable is:"+C);
		System.out.println("default variable is:"+Default);
	}
	
	public static void main(String[] args) {
		Accessmodifier_demo d=new Accessmodifier_demo();
		d.show();
	}
	
	

}