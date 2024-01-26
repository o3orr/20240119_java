package 케이뱅크;


// 예금
// 다른 적금 상품들과는 다르게 많은 메서드를 자신에 맞게 오버라이딩함
public class Deposit extends AccountProduct {
	protected int payment; //납입 금액
	
	//생성자로 이름과 이율만 초기화해줌 
	// 케이스를 3으로 골라서 조상의 변수로 Deposit객체를 생성하면
	// 생성자로 이름과 이율이 초기화
	Deposit(String name){
		this.name = name;
		rate = 0.045;
	}
	
	// 예금전용 세전이자 금액 구하는 메서드
	// 조상 메서드 오버라이딩해서 자신에 맞게 바꿈
	@Override
	public int basicInterest(int payment, int period) {
		this.payment = payment; //매개변수로 들어온 payment로 클래스의 payment초기화
		this.period = period;
		interestMoney = (int)(payment * rate) * period / 12;
		//세전이자
		return interestMoney;
	}
	
	// 세전 예금만기금액 구하는 메서드
	@Override
	public int maturityAmount() {
		maturityAmount = payment + interestMoney;
		// 세전 만기금액 = 납입금액 + 세전이자금액 
		return maturityAmount; //세전 만기금액 구한 거 반환
	}
	
	
	//예금전용 세후이자금액 구하는 메서드 
	//세후만기금액 구하는 데에 사용
	@Override
	public int realInterest(int mounPayment, int period) { // 납입금액과 기간 매개변수 두개
		realInterestMoney = interestMoney - (int)(interestMoney * 0.154);
		// 세후이자
		return realInterestMoney; // 세후 이자금액구한 거 반환
	}
	
	
	// 세후 예금만기금액 구하는 메서드
	@Override
	public int realMaturityAmount() {
		realMaturityAmount = payment + realInterestMoney;
		// 세후 만기금액 구하는 식
		return realMaturityAmount; //세후 만기금액 구한 거 반환
	}

}
