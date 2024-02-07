package aaa;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() { //타입변수 T에 Car가 있으니 무조건 Car가 반환타입이 됨
		return new Car(); //Car객체를 반환해주는 함수
	}

}
