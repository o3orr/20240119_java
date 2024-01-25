import java.util.*;

public class Exception01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num1 = s.nextInt();
		
		//try 블록
		try {
			int num2 = 10 / num1; //num이 0일때 0으로 못나누니까 예외발생
			System.out.println(num2);
		} //catch 블록
		catch(Exception e) { //모든 예외의 조상
			System.out.println("올바른 숫자를 입력하세요");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
