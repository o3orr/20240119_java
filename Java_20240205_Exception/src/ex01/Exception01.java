package ex01;

import java.util.*;

public class Exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double div = 0;
		System.out.println("정수 2개 입력 >>");
		
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			div = num1 / num2;	
			//문제의 소지가 있는 코드들
		} catch(InputMismatchException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} 
		
		System.out.println("나누기 : " + div);

		System.out.println("프로그램 종료");
	}

}
