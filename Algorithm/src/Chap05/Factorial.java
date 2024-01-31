package Chap05;
import java.util.*;

public class Factorial {
	
	//음이 아닌 정수의 팩토리얼 값을 반환
	static int factorial(int n) {
		if (n>0) 
		 return n * factorial(n-1);
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int x = in.nextInt();
		
		System.out.println(factorial(x));
		
	}

}
