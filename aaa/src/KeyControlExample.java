import java.util.*;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택:");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		String[] str = {"kor", "eng", "math", "com", "sci"};
		
		for (String s : str) {
			System.out.println(s);
			
			
			String strVar1 = "홍길동";
			String strVar2 = "홍길동";
			
			if(strVar1 == strVar2) {
				System.out.println("strVar1과 strVar2는 참조가 같음");
			} else {
				System.out.println("strVar1과 strVar2는 참조가 다름");
			}
			
			if (strVar1.equals(strVar2)) {
				System.out.println("strVar1과 strVar2는 문자열이 같음");
			}
			
			String strVar3 = new String("홍길동");
			String strVar4 = new String("홍길동");

			if(strVar3 == strVar4) {
				System.out.println("strVar3과 strVar4는 참조가 같음");
			} else {
				System.out.println("strVar3과 strVar4는 참조가 다름");
			}
			
			if(strVar3.equals(strVar4)) {
				System.out.println("strVar3과 strVar4는 문자열이 같음");
			}
				
		}

	}

}
