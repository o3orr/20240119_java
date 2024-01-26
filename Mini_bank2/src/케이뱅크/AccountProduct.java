package 케이뱅크;

public class AccountProduct {
	protected double rate; // 금리
	protected int period; // 가입 기간
	protected int payment; // 월 납입 금액
	
	protected int interestMoney; // 세전 이자 금액
	protected int realInterestMoney; // 세후 이자 금액
	
	protected int maturityAmount; // 세전 만기 금액
	protected int realMaturityAmount; // 세후 만기 금액

	protected double realRate; // 세후 이자율
	protected String name; // 고객이름
	
	
	public String getName() { return name; }
	
	// 세전 이자 금액 구하는 메서드 - 세전 만기 금액에 활용
	public int basicInterest(int monthPayment, int period) {
		this.payment = monthPayment;
		this.period = period;
		int sum = 0;
		for (int i = period; i>0; i--) {
			interestMoney = (int)(monthPayment * rate) * i /period;
			//세전 이자금액 구하는 식
			sum += interestMoney; // 달에따라 다른 세전이자금액을 더해서 반환
		}
		return sum;
	}
	
	
	// ( 세전 만기금액 = 납입금액 + 세전이자금액 ) 구하기 
	// 위의 세전 이자 금액 구하는 메서드를 활용
	public int maturityAmount() {
		maturityAmount = payment * period + basicInterest(payment, period);
		// 세전 만기금액 = 총 납입금액 + 세전 금액
		return maturityAmount;
	}
	
	
	// 세후 이자 금액 구하기
	public int realInterest(int monthPayment, int period) {
		this.payment = monthPayment;
		this.period = period;
		int sum = 0;
		for (int i = period; i > 0; i--) {
			realInterestMoney = (int)(monthPayment * realRate(period)) * i / period; 
			//세후 이자금액 구하는 식
			sum += realInterestMoney; // 달에따라 다른 세후이자금액을 더해서 반환
		}		
		return sum;
	}
	
	// ( 세후 만기금액 = 납입금액 + 세후이자금액 ) 구하기
	// 위의 세후 이자 금액 구하는 메서드를 활용
	public int realMaturityAmount() {
		realMaturityAmount = payment * period + realInterest(payment, period);
		// 세후 만기금액 = 총 납입금액 + 세후 금액;
		return realMaturityAmount;
	}
	
	// 적금 실제 이율 구하기 -> 세후 이자금액 구하는 데에 사용되는 메서드
	public double realRate(int period) {
		realRate = (rate * (period + 1) / 24) * (1 - 0.154);
		return realRate;
	}

}
