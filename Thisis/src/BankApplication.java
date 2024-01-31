import java.util.*;



public class BankApplication {
	
		private static Scanner in = new Scanner(System.in);
		private static Account[] ac = new Account[100]; //계좌가 100개 들어갈 수 있음

		public static void main(String[] args) {

		boolean run = true;
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int choice = Integer.parseInt(in.nextLine());
			System.out.println("--------");
			
		switch(choice) {
		case 1:
			createAccount(); //계좌생성
			break;
		case 2:
			printAccount(); //계좌목록 출력
			break;
		case 3:
			accountDeposit(); //예금
			break;
		case 4:
			withDraw(); //출금
			break;
		default :
			run = false;
			break;
			}
		}
	}
	
	public static void createAccount() { //계좌생성 메서드
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String accountNum = in.nextLine();
		
		System.out.print("계좌주: ");
		String name = in.nextLine();
		
		System.out.print("초기입금액: ");
		int Deposit = Integer.parseInt(in.nextLine());
		
		Account newAccount = new Account(accountNum, name, Deposit);
		//계좌 생성
		
		//객체를 따로 만들어서 그냥 그 주소를 배열에 대입... 배열은 주소의 모음이니까
		for(int i=0; i<ac.length; i++) { 
			//반복문 돌려서 계좌배열이 비어있는 부분에 새로만든 객체를 저장
			if (ac[i] == null) {
				System.out.println();
				ac[i] = newAccount;
				break;
			}
		}
		
		System.out.println("결과 : 계좌가 생성되었습니다");
	}
	
	public static void printAccount() { //계좌목록 출력
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for (int i=0; i<ac.length; i++) {
			if (ac[i] != (null)) { //주소비교
			System.out.print(ac[i].getAccountNum() + "  ");
			System.out.print(ac[i].getName() + "  ");
			System.out.print(ac[i].getDeposit());
			System.out.println();
			}
		}
	}
	
	public static void accountDeposit() { //예금
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String accountNum = in.nextLine();
		
		System.out.print("예금액: ");
		int Deposit = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<ac.length; i++) {
			if (ac[i] != (null)) {
			if(ac[i].getAccountNum().equals(accountNum)) {
				ac[i].deposit(Deposit); //입금기능 
			}
			}
		}
		
	}
	
	public static void withDraw() { //출금
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String accountNum = in.nextLine();
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<ac.length; i++) {
			if (ac[i] != (null)) {
			if(ac[i].getAccountNum().equals(accountNum)) {
				ac[i].withDraw(money); //출금기능 
			}
			}
		}
		System.out.println("출금이 성공되었습니다");
		
	}
	
	
}
