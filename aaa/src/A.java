import java.util.*;
import java.io.*;


public class A {
	
	public static void main(String[] args) {
		Cat2 c = new Cat2();
		c.sound();
	}

	

}

class Encapsulation { //캡슐화 변수는 private으로 설정해놓고 메소드로 변수접근
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class ParentCat {
	public String breed = "샴고양이";
	void methodParent() {
		System.out.println("어미 고양이");
	}
}

class Kitten extends ParentCat {
	void methodKitten() {
		System.out.println("아기 고양이");
	}
}


 class CatButler { //메서드 오버로딩
	public void myRole(int age) {
		System.out.println(age);
	}
	
	public void myRole(String name) {
		System.out.println(name);
	}
	
	public void myRole(String name, int age) {
		System.out.println();
	}
}
 
 
 
 class Animal {
	 public void sound() {
		 System.out.println("");
	 }
 }

 class Cat extends Animal { //조상의 메서드를 자신에 맞게 바꿈 -> 메서드 오버라이딩
	 public void sound() {
		 System.out.println("cat");
	 }
 }
 
 class Dog extends Animal { // 조상의 메서드를 자신에 맞게 바꿈 -> 메서드 오버라이딩
	 public void sound() {
		 System.out.println("dog");
	 }
 }
 
 
 abstract class Animal2 { //추상클래스
	 abstract void sound();
	 
	 void sleep() {
		 System.out.println("zzz");
	 }
 }
 
 class Cat2 extends Animal2 {
	 public void sound() {
		 System.out.println("kkk");
	 }
 }
 

