package ex09;

class Box<T> {
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory {
	
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box(); //박스 객체를 생성하고 
		box.set(o); //생성한 box의 set메서드 호출
		return box; // 생성한 객체를 반환해줌
	}
}

public class GenericMethod {

	public static void main(String[] args) {

		Box<String> sBox = BoxFactory.makeBox("Korea");
		//String 객체만 담을 수 있는 box객체가 생성됨
		//생성된 박스객체의 set메서드를 호출해서 그 매개변수 값으로 Korea를 줌 -> 
		//box의 obj가 Korea로 변경됨
		//그리고 참조변수 box가 갖고있는 주소를 반환 -> box객체를 반환한것과 같음
		//obj는 korea(0x10)객체를 가리키고 sbox는 new box(0x20)를 가리킴
		
		System.out.println(sBox.get());
		//sbox는 0x20을 가리키고 있고 new box객체에서 get메서드를 얻어옴
		// get메서드에서 obj가 가지고 있는 Korea(0x10)을 반환
	
		
		Box<Integer> iBox = BoxFactory.makeBox(100);
		//Integer 객체만 담을 수 있는 new Box<Integer>(0x20)생성됨
		//box변수로 new Box에 접근해서 set메서드로 obj에 객체 100(0x10)을 집어넣음
		//그리고 box변수에 담아져있는 new Box<Integer>(0x20)객체 반환
		//obj는 100(0x10)을 가리키고 iBox는 new Box<Integer>(0x20)을 가리킴
		
		System.out.println(iBox.get());
 
	}

}
