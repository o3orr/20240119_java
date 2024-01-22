
public class Kitten extends Cat{
	
	void meow2() {
		System.out.println("새끼 고양이가 야옹하고 울다");
	}
	
	@Override
	public void sound() { //조상의 메서드 오버라이딩
		System.out.println("새끼 고양이는 야옹하고 울다");
	}

}
