package ch13.sec01;

public class Car {
	/*
	 * public void run( ) { System.out.println("자동차가 달립니다"); }
	 */
	//필드
	
	private Tire tire1 = new Tire(); //그냥 객체
	private Tire tire2 = new Tire() { //이게 익명객체 
	
	public void roll() {
		System.out.println("익명 자식 Tire 객체 1이 굴러갑니다");
		}//익명 자식객체의 메서드
	};
	
	public void run1() {
		tire1.roll(); //그냥 객체사용
		tire2.roll(); //익명객체사용
		//필드에 있는 것 사용
	}
	
	//메소드 안에서 익명객체 사용
	public void run2() {
		
		//지역 변수 타입 Tire에 Tire의 익명 객체 대입
		Tire tire = new Tire() {
			
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
