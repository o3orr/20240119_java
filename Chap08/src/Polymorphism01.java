
class CalculateSquare { 
	//사각형 넓이 구하는 클래스
	// 정수, 실수 들어가는 값에따라 다른메소드를사용하는 오버로딩
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	
	public int square(int width, int height) {
		int area = width * height;
		return area;
	}
	
	public double square(double width, double height) {
		double area = width * height;
		return area;
	}
	
	public double square(int width, double height) {
		double area = width * height;
		return area;
	}
}

public class Polymorphism01 {

	public static void main(String[] args) {
		CalculateSquare c = new CalculateSquare();
		System.out.println("가로:10, 세로 5, 사각형의 넓이는 " + c.square(10, 5));
		System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는 " + c.square(2.5, 4.5));

	}

}
