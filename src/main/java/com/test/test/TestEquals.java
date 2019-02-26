package com.test.test;

import java.util.HashSet;
import java.util.Set;

import com.test.entity.Person;

public class TestEquals {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode() + " " + s2.hashCode());

		Set<String> set01 = new HashSet<>();
		set01.add(s1);
		set01.add(s2);

		System.out.println(set01.size());//1

		System.out.println("======================");
		
		Person p1 = new Person("abc");
		Person p2 = new Person("abc");

		System.out.println(p1 == p2);//false
		System.out.println(p1.equals(p2));//重写了equals，true；没有重写，false
		System.out.println(p1.hashCode() + " " + p2.hashCode());

		Set<Person> set02 = new HashSet<>();
		set02.add(p1);
		set02.add(p2);

		System.out.println(set02.size());//重写了hashCode和equals，1；没有重写，2
	}

}
