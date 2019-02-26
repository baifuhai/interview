package com.test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10);
		list.add(1);

		List<Integer> list2 = new LinkedList<>();
		list2.add(1);

		HashMap<String, Integer> map = new HashMap<>(16, 0.75f);
		map.put("A", 1);
		map.put("B", 2);
		map.put(null, 3);
		map.put("A", 4);
		System.out.println(map);
	}

}
