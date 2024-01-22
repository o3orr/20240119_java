import java.util.*;

public class aaaa {
	public static void main(String[] args) {
		
		/*
		 * int age = 19;
		 * 
		 * if (age >= 20) { System.out.println("성년"); }
		 * 
		 * if (age < 20) { System.out.println("미성년"); }
		 */
		
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		
		/*
		 * if (a % 3 == 0 && a % 5 == 0) { System.out.println("좋아요"); } else {
		 * System.out.println("싫어요"); }
		 */
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (b > c) {
			System.out.println("큰 값 : " + b);
			System.out.println("작은 값 : " + c);
		} else if (b > c){
			System.out.println("큰 값 : " + c);
			System.out.println("작은 값 : " + b);
		} else {
			System.out.println("같음");
		}
		
		int d = sc.nextInt();		
		int e = sc.nextInt();		
		int f = sc.nextInt();	
		
		int max = d;
		
		if (d > e && d > f) {
			max = d;
		} else if (e > d && e > f) {
			max = e;
		} else if (f > d && f > e){
			max = f;
		}
		
		
		
	}
}
