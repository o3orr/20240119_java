package ex03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		

		int m = 0; //잔고
		boolean flag = true;
		
		System.out.println("---------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("---------------------------------");
		
		while (flag) {
			System.out.print("선택> ");
			int s = sc.nextInt();
			int t;
			
			switch(s) {
			case 1: 
				System.out.print("예금액>");
				t = sc.nextInt();
				m += t;
				break;
				
			case 2: 
				System.out.print("출금액>");
				t = sc.nextInt();
				m -= t;
				break;
				
			case 3: 
				System.out.println("잔고>"+ m);
				break;
				
			case 4: 
				flag = false;
				break;
				
			}
			
		}
		
		System.out.print("프로그램 종료");

	}
	}



