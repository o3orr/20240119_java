package ch13.sec01;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		return new Car();
	} //리턴타입이 반드시 Car여야함

}
