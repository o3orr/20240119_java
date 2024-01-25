
public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Ractangle 생성자 호출");
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length * width;
	}
	
	public String toString() {
		return "사각형 색상은 " + super.color + "그리고 면적은 :" + area(); 
	}

}
