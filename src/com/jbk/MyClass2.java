package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class MyClass2 {
	public static void main(String[] args) {
		
		List l=new ArrayList();
		List<String> list=new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		l.add(list);
		//System.out.println(list);
		System.out.println(l);
	}

}
