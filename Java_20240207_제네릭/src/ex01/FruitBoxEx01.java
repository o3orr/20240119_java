package ex01;

class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an Orange";
	}
}


class Box<T>{ //사과담는 상자
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}


public class FruitBoxEx01 {
	
	public static void main(String[] args) {

		Box<Apple> box1 = new Box();
		Box<Orange> box2 = new Box();
		
		box1.setObj(new Apple());
		box2.setObj(new Orange());
		
		Apple ap = box1.getObj();
		Orange op = box2.getObj();
		
	}

}
