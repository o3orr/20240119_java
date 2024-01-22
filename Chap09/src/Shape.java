
public abstract class Shape {
	String color;
	
	//추상메서드가 2개 있는 추상클래스
	abstract double area(); 
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
