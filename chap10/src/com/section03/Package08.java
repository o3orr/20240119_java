package com.section03;

import java.util.Date;

public class Package08 {

	public static void main(String[] args) {
		
		Date this_date = new Date(2024, 1, 25);
		//현재날짜
		Date given_date = new Date(2022, 1, 25);
		//지난날짜
		
		boolean status1 = this_date.after(given_date);
		//현재날짜는 지난날짜 이후일이다  status1 = true
		boolean status2 = this_date.before(given_date);
		//현재날짜는 지난날자 이전일이다  status2 = false
		
		System.out.println(status1);
		System.out.println(status2);

	}

}
