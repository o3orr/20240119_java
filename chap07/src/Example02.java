
public class Example02 {
	
	static void myMethod() {
		System.out.println("정적 메서드 호출");
	}
	
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}

	public static void main(String[] args) {
		myMethod(); 
		
		Example02 e = new Example02();
		e.myMethod2();

	}

}
