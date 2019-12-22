package com.jbk;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class TreeMapTest {
	public static void main(String[] args) {
		Map<Integer, String> m=new TreeMap<>();
		m.put(11, "Audi");
		m.put(null, null);
		m.put(11, "Bmw");
		m.put(null, "fer");
		System.out.println(m.size());
		System.out.println(m);
	}

}
