package com.test.test;

import com.test.entity.Person;

public class TestTransferValue {

	public static void changeValue1(int age) {
		age = 30;
	}

	public static void changeValue2(Person person) {
		person.setName("xxx");
	}

	public static void changeValue3(String str) {
		str = "xxx";
	}

	public static void main(String[] args) {
		int age = 20;
		changeValue1(age);
		System.out.println("age: " + age);
		
		Person person = new Person("abc");
		changeValue2(person);
		System.out.println("person.name:" + person.getName());
		
		String str = "abc";
		changeValue3(str);
		System.out.println("str: " + str);
	}

}
