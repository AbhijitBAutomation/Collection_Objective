package com.jbk;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(11, "a");
		hashMap.put(null, "c");
		hashMap.put(null,null);
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		
	}

}
