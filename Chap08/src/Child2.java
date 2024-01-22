
public class Child2 extends Parent2{
	String name = "홍길동";
	
	Child2() {
		super(); //부모의 생성자 호출
		//부모의 기본생성자에는 이름을 출력하는 코드가 있음
		System.out.println("자식 이름 : " + name);
	}

}
