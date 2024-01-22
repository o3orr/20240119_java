package ex03;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int sum2 = 0;
		int count = 0;
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
		
		int a=0; //짝수합
		int b=0; //홀수합
		
		for (int i=1; i<=100; i++) {
			if (i % 2==0) {
				a += i;
			} else {
				b += i;
			}
		}
		
		System.out.println(a);
		System.out.println(b);

		
		
				
		}
		
		
		

	}

