package com.section03;

import java.util.Calendar;
import java.util.Date;

public class Example10 {

	public static void main(String[] args) {
		
		Calendar calender = Calendar.getInstance();
		
		System.out.print(calender.get(Calendar.YEAR)+ "년 ");
		System.out.print(calender.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(calender.get(Calendar.DATE)+ "일");
		

	}

}
