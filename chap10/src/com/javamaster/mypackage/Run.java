package com.javamaster.mypackage;

public class Run {
	public static void main(String[] args) {
		Cat cat01 = new Cat();
		Cat cat02 = new Cat();
		
		Kitten k = new Kitten();
		Cat cat03 = new Kitten();
		
		System.out.println(cat03.getClass());
		
		System.out.println(cat01);
		System.out.println(cat02);
		
		System.out.println(cat01.equals(cat02));
		
	}

}
