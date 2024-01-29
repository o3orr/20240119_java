package ex01;

public class Car {
	private String make;
	private String model;
	private String year;
	private String color;
	private boolean engine;
	
	Car() {
		this("기아");
	}
	
	Car(String m) {
		this(m, "k8");
	}
	
	Car(String m, String m2) {
		this(m, m2, "2020");
	}
	
	Car(String m, String m2, String y) {
		this(m, m2, y, "흰색");
	}
	
	Car(String m, String m2, String y, String c) {
		make = m;
		model = m2;
		year = y;
		color = c;
	}
	
	public void setMake(String m) {
		make = m;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public void setYear(String m) {
		year = m;
	}
	
	public void setColor(String m) {
		color = m;
	}
	
	void startEngine() {
		engine = true;
	}
	
	void stopEngine() {
		engine = false;
	}
	
	void displayCarDetails() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
		System.out.println(color);
		System.out.println(engine);
	}
	

	public static void main(String[] args) {
		Car car = new Car();
		
		car.displayCarDetails();
		
		//car.setColor("흰색");

	}

}
