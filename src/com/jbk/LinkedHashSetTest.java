package com.jbk;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
	    Set<Object> s=new LinkedHashSet<>();
		s.add("1");
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(s);
		
		
		
	}

}
