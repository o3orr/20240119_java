package ch11;

public class ThrowsExample1 {
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2"); 
	}

	public static void main(String[] args) {
		try {
			findClass();//이 메서드에서 발생할 수 있는 예외를 여기서 처리해줌 그게 throws를 사용한 예외떠넘기기
		} catch(ClassNotFoundException e) { 
			System.out.println("예외 처리: " + e.toString());
		}

	}

}
