
public class Constructor03 {

	public static void main(String[] args) {
		Add a = new Add(1, 2); 
		// Add클래스의 오버로딩된 일반 생성자중 Add(int, int) 호출
		
		Add b = new Add(2.4, 6.2);
		// Add클래스의 오버로딩된 일반 생성자중 Add(double, double) 호출

		Add c = new Add(3, 5.5);
		// Add클래스의 오버로딩된 일반 생성자중 Add(int, double) 호출

	}

}
