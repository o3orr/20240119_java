package com.section03;

import java.util.Calendar;

public class Package09 {

	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.add(Calendar.YEAR, 10);
		
		System.out.println(c1.getTime());
		System.out.println(c2.getTime());
		
		int comp = c1.compareTo(c2);
		System.out.println(comp);

	}

}
