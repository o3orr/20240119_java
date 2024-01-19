package com.section03;

import java.util.*;

public class Package05 {

	public static void main(String[] args) {
		
		String str ="";
		String revStr1 = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("입력 문자열 : ");
		str = in.nextLine();
		
		for (int i= str.length() - 1; i >= 0; i--) {
			revStr1 += str.charAt(i);
		}
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(revStr1);
		System.out.println(sb.reverse());
		
		

	}

}
