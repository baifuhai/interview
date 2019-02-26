package com.test.test;

public class TestStaticSeq {

	static class Father {
		static {
			System.out.println("1");
		}

		{
			System.out.println("3");
		}

		public Father() {
			System.out.println("4");
		}
	}

	static class Son extends Father {
		static {
			System.out.println("2");
		}

		{
			System.out.println("5");
		}

		public Son() {
			System.out.println("6");
		}
	}

	public static void main(String[] args) {
		new Son();//1 2 3 4 5 6
		System.out.println("======================");
		new Son();//3 4 5 6
		System.out.println("======================");
		new Father();//3 4
	}

}
