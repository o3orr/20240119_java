package ex01;

public class 반환있고매개변수있음 {

	public static void main(String[] args) {
		
		int n = max(10, 20); //반환 O, 매개변수 O

		int num = max();	 //반환 O, 매개변수 X
		
		max1(); 			 //반환 X, 매개변수 X
		
		max1(10,20);         // 반환 X, 매개변수 O
		

	}
	
	////반환 O, 매개변수 O
	static int max(int a, int b) {
		return a > b? a : b;
	}
	
	
	// 반환 O, 매개변수 X
	static int max() {
		
		int a = 5;
		int b = 20;
		
		return a > b? a : b;
	}
	
	// 반환 X, 매개변수 X
	static void max1() { //메서드 오버로딩에 반환타입은 상관없음 
		
		int a = 5;
		int b = 20;
		
		System.out.println(a > b? a : b);
	}
	
	
	// 반환 X, 매개변수 O
	static void max1(int a, int b) { 
		
		System.out.println(a > b? a : b);
	}
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i =1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	

}
