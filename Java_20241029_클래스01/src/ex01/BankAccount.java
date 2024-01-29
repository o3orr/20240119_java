package ex01;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private int blance;
	
	BankAccount() {}
	
	BankAccount(String a, String h, int b) {
		accountNumber = a;
		accountNumber = h;
		blance = b;
	}
	
	void deposit(int money) {
		blance += money;
	}
	
	void withdraw(int money) {
		blance -= money;
	}
	
	void displayBalance() {
		System.out.println(blance);
	}

}
