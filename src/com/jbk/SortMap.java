package com.jbk;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
	public static void main(String[] args) {
		Map<Integer,Integer> treeMap=new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		
		treeMap.put(4,1);
		treeMap.put(2,1);
		treeMap.put(3,1);
		System.out.println(treeMap);
		
	}

}
