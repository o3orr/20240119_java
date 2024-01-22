package ex03;

import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		

		
		/*
		 
		*
		**
		***
		****
		*****
		
		*/
		for (int i=0; i<n; i++) {
			for (int j=0; j<i+1; j++) {
			System.out.print("*");
			} 
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<n; i++) {
			// i가 0일때 j가 5 (1행일때 별이 5개
			// i가 1일때 j가 4 (2행일때 별이 4개
			// i가 2일때 j가 3 (3행일때 별이 3개
			for (int j=n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// i가 0일때 j가 4 k가 1 (1행일때 공백이 4개 별이 1개
		// i가 1일때 j가 3 k가 2 (1행일때 공백이 3개 별이 2개
		// i가 2일때 j가 2 k가 3 (1행일때 공백이 2개 별이 3개
		// i가 3일때 j가 1 k가 4 (1행일때 공백이 2개 별이 3개
		// i가 4일때 j가 0 k가 5 (1행일때 공백이 2개 별이 3개
		
		System.out.println();
		
		for (int i=0; i<n; i++) {
			for (int j=n-1; j > i; j--) { 
				System.out.print(" ");
			}
			
			for (int k=1; k<=n; k++) { 
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
