package com.javamaster.mypackage;

public class Cat {
	String breed;
	String color;
	
	public void eat() {
		System.out.println("먹이를 먹다");
	}
	
	public void scratch() {
		System.out.println("발톱으로 햘퀴다");
	}
	
	public void meow() {
		System.out.println("야옹하고 울다");
	}
	
	public boolean equals(Object obj) {
        // 동일한 참조인 경우 true 반환
        if (this == obj) { //this는 현재 객체를 나타냄 this.breed는 객체의 인스턴스변수를 나타냄
            return true;
        }

        // obj가 null이거나 -> 들어온 객체가 null이거나
        // Cat 클래스의 인스턴스가 아닌 경우 false 반환
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cat 클래스의 인스턴스인 경우, 필요한 비교 수행
        // 여기에서는 예시로 cat의 어떤 속성을 비교한다고 가정
        Cat otherCat = (Cat) obj;
        // 여기에서 비교 로직 추가

        // 필요한 비교 로직에 따라 결과 반환
        return true;  // 예시로 모든 경우를 동일하다고 가정
    }
}

class Kitten extends Cat {
	public void sleep() {
		System.out.println("zzz");
	}
}


 
