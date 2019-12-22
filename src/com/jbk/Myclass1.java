package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class Myclass1 {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(sum(list));
		
		
	}

	public static double sum(List<? extends Number> list){
         //list.add(4);
		

		double sum=0;
		
		for(Number num : list){
			sum+=num.doubleValue();
		}
		return sum;
		
		
		
	}
		
		
	

}
