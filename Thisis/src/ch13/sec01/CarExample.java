package ch13.sec01;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		
		//익명 자식 객체가 대입된 필드사용
		car.run1(); //tire2.roll();

		
		//익명 자식 객체가 대입된 로컬변수 사용
		car.run2();
		// 메서드의 지역변수중 Tire가 있고 그 변수안에 익명자식객체 tire를 생성해서 
		// 거기서 roll메소드를 만들음 그리고 run2메서드에서 tire.roll()을 사용함
	
		car.run3(new Tire() { 
			
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다");
			}
		}); //익명객체 닫기, 메소드닫기, 그다음에 세미콜론
	}	//car클래스의 run3메서드에서 Tire타입으로 매개변수를 받고
		//메인메서드에서 익명객체를 생성해서사용

}
