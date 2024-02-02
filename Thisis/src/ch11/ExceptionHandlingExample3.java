package ch11;

public class ExceptionHandlingExample3 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); 
				//배열에 있는 값들을 정수로 바꿔서 저장
				//밑에는 이 과정을 수행할 때 일어나는 예외들
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NullPointerException | NumberFormatException e) {
				//2가지 예외를 동일하게 처리
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
		}

	}

}
