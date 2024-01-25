
public abstract class Shape {
	String color;
	
	//추상메서드가 2개 있는 추상클래스
	abstract double area(); 
	// 넓이 구하는 메서드 추상메서드로 만들어서 자손에 맞게 구현해서 사용하도록
	
	public abstract String toString();
	// 추상메서드로 만들어서 자손에 맞게 구현해서 사용하도록
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
