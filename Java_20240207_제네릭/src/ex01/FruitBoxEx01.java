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


class Box{ //사과담는 상자
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
}


public class FruitBoxEx01 {
	
	public static void main(String[] args) {

		Box box = new Box();
		
		box.setObj(new Apple());
		box.setObj(new Orange());
		
		Apple ap = (Apple) box.getObj();
		Orange op = (Orange) box.getObj();
		
	}

}
