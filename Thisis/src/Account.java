
public class Account {
	
	private String accountNum; //계좌번호 
	private String name; //이름 
	private int Deposit; //초기입금액

	
	public Account(String accountNum, String name,int Deposit ) {
		this.accountNum = accountNum;
		this.name = name;
		this.Deposit = Deposit;
	}
	
	
	//Setter
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setfirstDeposit(int Deposit) {
		this.Deposit = Deposit;
	}
	
	
	//Getter
	public String getAccountNum() {
		return accountNum;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getDeposit() {
		return Deposit;
	}
	


	//입금 기능
	public void deposit(int money) {
		Deposit += money; 
	}
	
	//출금 기능
	public void withDraw(int money) {
		Deposit -= money;
	}
	
	
	
	
	
}
