package 케이뱅크;

//계좌상품 - 부모
public class AccountProduct {
	protected double rate; //금리
	protected int period;  //가입 기간
	protected int payment; //월 납입 금액
	protected int interestMoney; //세전 이자 금액
	protected int realInterestMoney; //세후 이자 금액
	protected int maturityAmount; //세전 만기금액
	protected int realMaturityAmount;; //세후 만기 금액
	protected double realRate; //세후 이자율
	protected String name; // 고객이름
	
	public String getName() {
		return name;
	}
	
	// 세전 이자 금액 구하기
	public int basicInterest(int monthPayment, int period) {
		this.payment = monthPayment;
		this.period = period; // 매개변수로 받은 가입기간을 인스턴스변수안에 넣어줌
		int sum = 0;
		for (int i = period; i>0; i--) {
			interestMoney = (int)(monthPayment * rate) * i / period;
			// 세전 이자 금액 = (월 납입금액 * 금리) * 12~1 / 12
			sum += interestMoney;
		}
		return sum;
	}
	
	//만기 금액(세전) 구하기
	public int maturityAmount() {
		maturityAmount = payment * period + basicInterest(payment, period);
		// 세전 만기금액 = 월 납입 금액 * 기간 + 세전 이자율(월납입금액, 기간)
		return maturityAmount;
	}
	
	//세후 이자 금액 구하기
	public int realInterest(int monthPayment, int period) {
		this.payment = monthPayment; // 월 납입 금액
		this.period = period; //납입 기간
		int sum = 0;
		for (int i = period; i>0; i--) { // 12 - 11 - 10 ...
			realInterestMoney = (int)(monthPayment * realRate(period)) * i / period;
			// 세후 이자 금액 = (월 납입 금액 * 적금실제이율(기간)) * 12~1 / 기간;
			sum += realInterestMoney;
		}
		return sum;
	}
		
	//세후 만기 금액 구하기
	public int realMaturityAmount() {
		realMaturityAmount = payment * period + realInterest(payment, period);
		// 세후 만기금액 = 월 납입 금액 * 기간 + 세후이자금액(월납입금액, 기간)
		return realMaturityAmount;
	}
	
	//적금 실제 이율 구하기
	public double realRate(int period) {
		realRate = (rate * (period + 1) / 24) * (1 - 0.154);
		return realRate;
	}
		
		
	}

