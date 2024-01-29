package ex01;

public class Cat {
	private String breed;
	private String color;
	
	//멤버 변수 값을 대입 및 변경은
	//생성자를 이용 또는 setter를 이용해서 값을 변경이나 초기화한다 
	
	//setter는 변수값을 변경할 때 사용
	//getter는 변수값을 읽어올 때 사용
	
	//setter -> set+변수명 조합 
	void setBreed(String s) {
		breed = s;
	}
	void setColor(String c) {
		color = c;
	}
	
	
	
	//생성자 클래스 이름하고 같다
	Cat(String s, String s2) {
		breed = s;
		color = s2;
	}
	
	void eat() {
		System.out.println("breed");
		System.out.println("color");
	}
	
	void scratch() {
		
	}
	
	void meow() {
		
	}

}
