package com.tnsif_78;

public class Encapsulation_1 {
	
	
	String fruit;
	int count;
	String veraity;
	
	
	//getter and setter
	
	
	public String getfruitName() {
		return fruit;
	}
	
	public void setfruitName(String fruit) {
         this.fruit=fruit;      
		
	}
	public int getcount() {
		return count;
		
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public String getveraity() {
		return veraity;
		
	}
	
	public void setVeraity(String veraity) {
		this.veraity = veraity;
	}
	
	public String tostring() {
		return "Encapsulation_1 [name=" + fruit + ", count" + count + ", veraity" + veraity + "]";

	}
	

}

