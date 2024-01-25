package 케이뱅크;

//예금 - 자식
public class Deposit extends AccountProduct{
	protected int payment; //납입 금액
	
	Deposit(String name) { //생성자
		this.name = name;
		rate = 0.045;
	}
	
	//세전 이자금액
	//AccountProduct메서드 오버라이딩
	@Override
	public int basicInterest(int payment, int period) {
		this.payment = payment;
		this.period = period;
		interestMoney = (int)(payment * rate) * period / 12;
		//세전 이자 금액 = (월납입금액 * 금리) 기간 / 12
		return interestMoney;
	}
	
	//만기 금액(세전)
	@Override
	public int maturityAmount() {
		maturityAmount = payment + interestMoney;
		return maturityAmount;
	}
	
	//세후 이자 금액
	@Override
	public int realInterest(int monthPayment, int period) {
		realInterestMoney = interestMoney - (int)(interestMoney * 0.154);
		return realInterestMoney;
	}
	
	@Override
	public int realMaturityAmount() {
		realMaturityAmount = payment + realInterestMoney;
		return realMaturityAmount;
	}

}
