import java.util.*;


public class BankApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		private static Account[] ac = new Account[100]; //계좌가 100개 들어갈 수 있음
		int i=0; //계좌 순서
		
		boolean flag = true;
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int choice = Integer.parseInt(input.nextLine());
			System.out.println("--------");
			
		switch(choice) {
		case 1:
			System.out.println("계좌생성");
			System.out.println("--------");
			
			ac[i].setAccountNum(input.nextLine());
			ac[i].setName(input.nextLine());
			ac[i].setfirstDeposit(Integer.parseInt(input.nextLine()));
			
			System.out.println("계좌번호: " + ac[i].getAccountNum());
			System.out.println("계좌주: " + ac[i].getName());
			System.out.println("초기입금액: " + ac[i].getDeposit());
			
			System.out.println("결과 : 계좌가 생성되었습니다");

			i++;
			break;
		case 2:
			System.out.println("계좌목록");
			System.out.println("--------");
			
			System.out.print(ac[i].getAccountNum()+ "  " + ac[i].getName() + "  " + ac[i].getDeposit());
			
			break;
		case 3:
			break;
		case 4:
			break;
		default :
			i++;
			flag = false;
			break;
		}
		
		}
		
	}
	
	public void createAccount() {
		System.out.println("계좌생성");
		System.out.println("--------");
		
		Account newAccount = new ()
		
		System.out.println("계좌번호: " + ac[i].getAccountNum());
		System.out.println("계좌주: " + ac[i].getName());
		System.out.println("초기입금액: " + ac[i].getDeposit());
		
		System.out.println("결과 : 계좌가 생성되었습니다");
	
		i++;
	}
}
