package com.section03;

import java.util.*;

public class Example12 {

	public static void main(String[] args) {
		
		Random random1 = new Random();
		System.out.println(random1.nextInt()); //int형의 난수를 반환
		
		Random random2 = new Random();
		for (int i = 0; i <10; i++) {
			System.out.println(random2.nextInt(100));
			//100미만의 난수발생
		}
		
		random1.setSeed(50);

	}

}
