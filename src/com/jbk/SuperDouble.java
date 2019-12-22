package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class SuperDouble {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(2);
		//m(1);
		
		
	}
	static void m(List<? super Double> l){
		System.out.println(l.get(0));
		System.out.println(l.get(1));
	}

}
