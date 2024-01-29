
public class Father implements Parent{ //인터페이스 구현 클래스
	//인터페이스의 자손 클래스

	@Override
	public void printlnfo() { //인터페이스의 추상메서드 구현
		System.out.println("아버지입니다");
		
	}
}
