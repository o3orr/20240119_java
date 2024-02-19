package ex13;

class Box<T> {
	
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	public String toString() {
		return obj.toString();
	}
}

class Unboxer {
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box<>();
		

	}

}
