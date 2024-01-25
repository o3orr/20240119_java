
public class AbstractClass01 {

	public static void main(String[] args) {
		Shape s1 = new Circle("빨간색", 2.2);
		// 다형성 조상의 매개변수로 자손의 객체사용
		Shape s2 = new Rectangle("노란색", 2, 4);
		// 다형성 조상의 매개변수로 자손의 객체 사용
		// Shape에 toString()이 있으니까 이걸로 toString()사용
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		

	}

}
