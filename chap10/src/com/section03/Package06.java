package com.section03;

import java.util.Scanner;

public class Package06 {

	public static void main(String[] args) {
		
		String str = "";
		String revStr1 = "";
		
		Scanner in = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer("");
		
		System.out.println("입력 문자열 : ");
		str = in.nextLine();
		
		
		for (int i= str.length()-1; i>=0; i++) {
			revStr1 = revStr1 + str.charAt(i);
		}
		
		System.out.println("String 클래스의 역순 문자열 : " + revStr1);
		
		StringBuilder revStr2 = new StringBuilder();
		revStr2.reverse();
		
		System.out.println("StringBuilder 클래스의 역순 문자열 : " + revStr1);
		
		
		

	}

}
