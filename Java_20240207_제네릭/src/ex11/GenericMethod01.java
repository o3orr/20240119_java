package ex11;

class Box<T> {
	protected T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		obj = o;
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		
		//이런 다형성은 가능 <>안에가 상속객체가 불가능
		Box<Integer> ibox = new SteelBox<>(1234);
		Box<String> sbox = new SteelBox<>("Korea");
		
		System.out.println(ibox.get());
		System.out.println(sbox.get());

	}

}
