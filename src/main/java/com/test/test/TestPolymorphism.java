package com.test.test;

public class TestPolymorphism {

	interface Animal {
		void eat();
	}

	static class Dog implements Animal {
		@Override
		public void eat() {
			System.out.println("dog eat...");
		}
	}

	static class Cat implements Animal {
		@Override
		public void eat() {
			System.out.println("cat eat...");
		}
	}

	public static void eat(Animal animal) {
		animal.eat();
	}

	public static void main(String[] args) {
		//Animal animal = new Dog();
		Animal animal = new Cat();
		eat(animal);
	}

}
