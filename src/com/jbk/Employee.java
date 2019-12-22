package com.jbk;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	String name;
	String id;
	
	 public Employee() {
		// TODO Auto-generated constructor stub
	}
	 
	 public Employee(String name,String id){
		 this.name=name;
		 this.id=id;
		 
		 		 
	 }

	@Override
	public int compare(Employee obj1, Employee obj2) {
		// TODO Auto-generated method stub
		return obj2.name.compareTo(obj1.name);
		
			}
	@Override
	public String toString(){
		return "{" +"name="+name+ ",id="+id+ "}";
		
	}
	
	

}
