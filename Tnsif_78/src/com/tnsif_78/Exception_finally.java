package com.tnsif_78;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception_finally{
	public static void main(String[] args) {
		
	
 
	try {
		System.out.println("enter the number:");
	
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	System.out.println("the number is :"+num);
	
		}
	
	catch(InputMismatchException e){
		System.out.println("wrong input....");
		
	}
	finally {
		System.out.println("final block is executed...");
		
	
	}
	
	}
}

