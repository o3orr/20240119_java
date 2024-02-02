package ch11;

//잔고 부족 예외를 사용자 정의 예외 클래스로 선언한 것
public class InsufficientException extends Exception {
	public InsufficientException() {
		//기본 생성자
	}
	
	public InsufficientException(String message) {
		super(message);
		//예외 메시지 입력받는 생성자 선언
	}

}
