package ch11;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		try {
			int result = data.length(); 
			//data가 null일 경우 NullPointerException발생
		} catch (NullPointerException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
			//예외 정보를 얻는 3가지 방법
		} finally {
			System.out.println("마무리 실행");
		}
	}

	public static void main(String[] args) {
		printLength("ThisisJava");
		printLength(null);

	}

}
