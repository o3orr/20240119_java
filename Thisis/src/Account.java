
public class Account {
	
	private String accountNum; //계좌번호 
	private String name; //이름 
	private int Deposit; //초기입금액

	
	
	
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
		
	}
	
	//출금 기능
	public void withDraw(int money) {
		
	}
	
	
	public void createAccount() {
		
	}
	
	
	
}
