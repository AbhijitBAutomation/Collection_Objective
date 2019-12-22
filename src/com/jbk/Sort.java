package com.jbk;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Sort implements Comparator<Map.Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> entry1, Entry<Integer, Integer> entry2) {
		// TODO Auto-generated method stub
		return (entry2.getValue().compareTo(entry1.getValue()));
	}

}
