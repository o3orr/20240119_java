package ch13.sec01;

public class A {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.useB();
	}
	
	//인스턴스 멤버 클래스
	class B {
		
		//인스턴스 필드
		int field1 = 1;
		
		
		//생성자
		B() {
			System.out.println("B-생성자 실행");
		}
		
		
		//인스턴스 메서드
		void method() {
			System.out.println("B-method1 실행");
		}
		
	}
	
	//A의 인스턴스 메소드
	void useB() {
		//B 객체 생성 및 인스턴스 필드 및 메소드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method();
	}
	
	
	

}
