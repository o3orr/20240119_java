
public class Circle extends Shape{
	private double radius;
	
	public Circle(String color, double radius) {
		super(color); //조상클래스 생성자 호출
		System.out.println("Circle 클래스 생성자 호출");
		this.radius = radius;
	}
	
	double area() { //추상클래스 구현
		return Math.round(radius * radius * 3.14);
	}
	
	// 
	public String toString() {
		return "원 색상은" + super.getColor() + " 그리고 면적은 : " + area();
	}

}
