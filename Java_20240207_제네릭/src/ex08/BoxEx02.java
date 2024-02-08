package ex08;

class A{
	public String toString() {
		return "A class";
	}
}

class B extends A {
	public String toString() {
		return "B class";
	}
}

class C extends B{
	public String toString() {
		return "C class";
	}
}

class Box<T extends A> {
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}


class Box2<T extends Number> {
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class BoxEx02 {

	public static void main(String[] args) {

		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box<B>();
		Box<C> cbox = new Box<C>();
//		Box<Integer> iiobx = new Box(); //에러 A의 자손만 들어갈 수 있음
		
		Box2<Integer> ibox = new Box2<>();
		Box2<Double> dbox = new Box2<>();

	}

}
