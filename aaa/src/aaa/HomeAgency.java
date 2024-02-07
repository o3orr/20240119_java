package aaa;

public class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() { //타입 변수 T에 Home이 들어가서 반환타입이 무조건 Home이 됨
		return new Home(); //Home객체를 반환해주는 함수
	}

}
