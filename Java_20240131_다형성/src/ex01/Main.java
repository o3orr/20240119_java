package ex01;

public class Main {

	public static void main(String[] args) {
		/*
		 * Animal a1 = new Dog(); 
		 * Animal a2 = new Cat(); 
		 * Animal a3 = new Bird();
		 */
		sound(new Dog());
		sound(new Cat());
		sound(new Bird());

	}
	
	public static void sound(Animal animal) {
		animal.makeSound();
	}
 
}
