
public class Cat {
	String breed;
	String color;
	
	Cat() {
		System.out.println("Cat() 생성자 호출합니다.");
		// 기본 생성자 선언
	}
	
	Cat(String breed) {
		System.out.println("Cat(String) 생성자 호출합니다");
		this.breed = breed; 
		//생성자의 매개변수로 받은 값을 멤버변수 breed의 값으로 변경
	}
	
	Cat(String breed, String color) {
		System.out.println("Cat(String, String) 생성자 호출합니다");
		this.breed = breed;
		this.color = color;
	}
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	
	void scratch() {
		System.out.println("발톱으로 햘퀴다");
	}
	
	void meow() {
		System.out.println("야옹하고 울다");
	}

}
