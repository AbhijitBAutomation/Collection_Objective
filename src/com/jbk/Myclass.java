package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class Myclass {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		//System.out.println(list);
		
		m(list);
		
	}
	public static void m(List<Integer> list){
		System.out.println(list);
	}

}
