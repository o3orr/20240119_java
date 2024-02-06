package ex01;

import java.util.*;

public class Exception02 {

	public static void main(String[] args) {
		int sum = func1();
		
		System.out.println("두 수 합은 : " + sum);
	}
	
	static int func1() {
			try {
				return func2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
	}
	
	static int func2() throws Exception{
		//예외가 발생하면???
		// ==> 1.내부에서 해결 /2.예외 던지기
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		return num1 + num2;
	}

}
