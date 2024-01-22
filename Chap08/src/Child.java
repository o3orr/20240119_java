
public class Child extends Parent{
	String name = "홍길동";
	
	public void details() {
		super.details(); //부모 이름 출력메서드 호출 // 홍길순
		System.out.println(name); //홍길동
	}
	
	public void printDetails() {
		details(); //부모, 자식 이름 출력메서드
		System.out.println("부모 이름 : " + super.name);
		// 부모이름 출력
		System.out.println("자식 이름 : " + name);
		// 자식이름 출력
	}

}
