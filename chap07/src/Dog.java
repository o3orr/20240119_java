
public class Dog {
	public String breed;
	public String color;
	protected int age;
	
	protected void Setter(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	protected void Getter() {
		System.out.println(breed);
		System.out.println(color);
		System.out.println(age);
	}
	
	public void bowwow() {
		System.out.println("멍멍짖다");
	}
	
	protected void run() {
		System.out.println("달리다");
	}
	

}
