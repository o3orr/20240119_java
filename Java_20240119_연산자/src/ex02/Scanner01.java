package ex02;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * String s = input.next(); //공백 포함하지 않음 한단어만 String s1 = input.nextLine(); //공백
		 * 포함해서 한줄
		 * 
		 * long l = input.nextInt();
		 * 
		 * System.out.println(input.getClass());
		 */
		
		int a = input.nextInt(); //20
		int b = input.nextInt(); //30
		
		System.out.println(a + b);
		System.out.println((double)(a + b) / 2);
	

	}

}
