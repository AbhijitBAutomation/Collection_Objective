package com.jbk;

import java.util.HashMap;

public class Employee1Test {
	public static void main(String[] args) {
		HashMap<Employee1, String> hm=new HashMap<Employee1,String>();
		hm.put(new Employee1("a"),"emp1");
		hm.put(new Employee1("b"),"emp2");
		hm.put(new Employee1("a"),"emp1 OVERRIDDEN");
		System.out.println(hm.size());
		System.out.println(hm.get(new Employee1("a")));

		

		
		
	}
	

}
