
public class Example01 {

	public static void main(String[] args) {
		BabyCat b = new BabyCat();
		
		System.out.println("품종 : " + b.breed);
		// 부모 클래스로부터 상속받은 필드
		System.out.println("색상 : " + b.color);
		// 자식 클래스의 필드
		
		b.eat(); 
		//부모 클래스로부터 상속받은 메서드 ParentCat의 메서드
		b.meow(); 
		//자식 클래스의 메서드 

	}

}
