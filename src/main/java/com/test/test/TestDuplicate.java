package com.test.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(3);

		list = removeDuplicate(list);
		for (Integer element : list){
			System.out.println(element);
		}
	}

	public static <T> List<T> removeDuplicate(List<T> list) {
		return new ArrayList<>(new HashSet<>(list));
	}

}
