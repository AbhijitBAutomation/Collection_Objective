package com.jbk;

import java.util.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
	
	public static void main(String...a) {
		Collection<Integer> collection =new HashSet<>();
		collection.add(3);
		collection.add(1);
		collection.add(2);
		
		Set<Integer> treeSet=new TreeSet<>(collection);
		System.out.println(treeSet);

					
		
	}

}
