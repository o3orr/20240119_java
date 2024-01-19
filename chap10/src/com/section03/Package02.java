package com.section03;

import com.javamaster.mypackage.*;

public class Package02 {

	public static void main(String[] args) {
		Dog dog01 = new Dog();
		Dog dog02 = new Dog();
		
		System.out.println(dog01.equals(dog02));
		
		String st1 = dog01.bowwow();
		String sr2 = dog02.bowwow();
		
		System.out.println(st1.equals(sr2));
		// String클래스가 object클래스의 equals를 오버라이딩해서 
		// 문자열이 같으면 true를 반환
	

	}

}
