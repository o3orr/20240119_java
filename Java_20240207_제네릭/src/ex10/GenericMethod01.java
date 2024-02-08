package ex10;

class Box<T> {
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o) { //들어올 수 있는 객체가 number자손 한정
		Box<T> box = new Box();
		box.set(o);
		
		System.out.println("Boxed : " + o.intValue());
		return box;
	}
}

class Unboxer {
	public static <T extends Number> T openBox(Box<T> box) { //들어올 수 있는 객체가 number자손 한정
		// new box<Integer>를 넣어줌 box로 조작
		// Box<Integer> box = new box<Integer>(); 랑 똑같음
		System.out.println("unboxed : " + box.get().intValue());
		// box로 obj안에 저장되어있는 100을 가져와서 int로 바꿈
		return box.get();
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = BoxFactory.makeBox(100);
		// 박스 객체 생성
		
		int num = Unboxer.openBox(ibox); //100저장
		System.out.println("data : " + num);

	}

}
