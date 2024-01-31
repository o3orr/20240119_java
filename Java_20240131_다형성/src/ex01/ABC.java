package ex01;

public class ABC {

	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		
//		B b = new A(); 에러
		//리모콘 참조변수가 A면 A에 있는 멤버만 사용가능
		B b = (B)a1; // 타입 변환
		
		a1.funcA();
		b.funcB(); //원래 객체가 b니까 


	}

}
