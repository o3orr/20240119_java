
public class Chicken implements Fly, Walk{ // 다중상속

	@Override
	public void walk() { // 인터페이스의 추상메서드 구현
		System.out.println("닭은 걸을 수 있다");
		
	}

	@Override
	public void fly() { // 인터페이스의 추상메서드 구현
		System.out.println("닭은 날 수 있다");
		
	}

}
