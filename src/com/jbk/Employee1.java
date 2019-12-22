package com.jbk;

public class Employee1 {
	
	private String name;
	public Employee1(String name){
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return (this.name==null? 0:this.name.hashCode());
	}
}
