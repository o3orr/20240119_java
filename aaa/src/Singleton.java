
public class Singleton {
	
	//priavte붙은 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 생성자 선언
	//외부에서 접근못함
	private Singleton() {		
	}
	
	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}
}
