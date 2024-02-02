package ch11;

public class Person {
	public void action(Workable workable) {
		workable.work("홍길동", "프로그래밍");
		//함수형 인터페이스 workable을 매개변수 타입으로 가지고
		//그 인터페이스의 메서드를 사용
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}

}
