package com.jbk;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsage {
	public static void main(String[] args) {
		Employee emp1=new Employee("sam", "4");
		Employee emp2=new Employee("amy", "2");
		ArrayList<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		//System.out.println(list);
		Collections.sort(list, new Employee());
		System.out.println(list);

		
	}

}
