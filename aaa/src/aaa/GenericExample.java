package aaa;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		//box를 생성할 때 타입 파라미터 t 대신 String으로 대체
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	
		
		
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		//Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		//Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind(); 
		String tvModel = product1.getModel();
		
		
		
		//K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<Car, String>();
		
		//Setter 매개값은 반드시 Car와 String으로 제공
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent(); //new home(); 객체가 생성됨
		home.turnOnLight(); //그래서 home으로 Home자체의 메서드를 쓸 수 있음
		
		CarAgency carAgency = new CarAgency();
		Car car2 = carAgency.rent(); //new Car(); 객체가 생성됨
		car2.run(); //그래서 car2로 Car자체의 메서드를 쓸 수 있음
		
		
		
		
		

	}

}
