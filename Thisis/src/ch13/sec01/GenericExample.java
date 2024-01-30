package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box(); 
		//Object를 모두 저장할 수 있는 box였는데
		//Box에는 String만 저장하고 꺼낼 수 있음
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		
		//K는 Tv로 대체, M은 String으로 대체
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		//Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		
		//Getter 리턴값을 Tv와 String이 됨
		Tv tv = product1.getKind(); //Tv객체니까 tv타입에 저장
		String tvModel = product1.getModel(); //스마트 티비가 tvModel에 저장
		
		
		//K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<Car, String>();
		
		//Setter 매개값은 반드시 Car와 String을 제공
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		//Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
		
		HomeAgency homeAgency = new HomeAgency();
		//인터페이스에 제네릭이 붙어있는 것이고 그걸 구현한 객체는 그냥 클래스
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car2 = carAgency.rent();
		car.run();
		
		//T를 Integer로 대체
		Box<Integer> b1 = boxing(100);
		int intValue = b1.get();
		System.out.println(intValue);
		
		//T를 String으로 대체
		Box<String> b2 = boxing("홍길동");
		String strValue = b2.get();
		System.out.println(strValue);
		
		
		boolean result1 = compare(10, 20);
		//compare은 Number타입만 넣을 수 있도록 제한 Integer가 들어감
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
		
		
		
	}
	
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	//타입 파라미터 T를 대체할 타입을 Number로 제한 제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " +
						t2.getClass().getSimpleName() + ")");
		
				
		double v1 = t1.doubleValue();
		//Number타입의 doubleValue()메소드 호출
		double v2 = t1.doubleValue();
		//Number타입의 doubleValue()메소드 호출
		
		return (v1 == v2);
	}

}
