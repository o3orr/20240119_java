package 케이뱅크;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AccountProduct ac = null; //일단 조상타입 참조변수 선언하고 null값으로 초기화
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 선택 [1]자유적금 [2]챌린지박스 [3]예금 : ");
		
		int sel = sc.nextInt(); // 몇번쓸지 번호입력
		switch(sel) {
		case 1 : 
			ac = new FreeSaving("이름"); break;
		case 2 :
			ac = new FreeSaving("이름"); break;
		case 3 :
			ac = new Deposit("이름"); break;
		default :
			System.out.println("상품을 잘못 선택하셨습니다");
		}
		
		System.out.print("납입 금액 : ");
		int money = sc.nextInt();
		System.out.print("가입 기간 : ");
		int period = sc.nextInt();
		
		if (sel == 1 || sel == 2) ac.realRate(period); // 적금상품은 실제이율계산
		
		//세전 이자금액 구하기 밑에서 써야되서 호출
		ac.basicInterest(money, period); 
		
		//세후 이자금액 구하기 밑에서 써야되서 호출
		ac.realInterest(money, period); 
		
		DecimalFormat formatter = new DecimalFormat("#,##0");
		//출력방식 바꿔주는 객체
		
		String maturityAmount = formatter.format(ac.maturityAmount());
		//세전 만기금액 구해서 String으로 저장
		String realMaturityAmount = formatter.format(ac.realMaturityAmount());
		//세후 만기금액 구해서 String으로 저장
		
		
		System.out.println("====== " + ac.getName() + " 님의 상품 가입 정보 ======");
		System.out.printf("금리 : %.2f%s\n", (ac.rate * 100), "%");
		System.out.printf("가입기간 : %d개월\n", ac.period);
		System.out.println("만기금액(세전) : " + maturityAmount + "원");
		System.out.println("만기금액(세후) : " + realMaturityAmount + "원");
		

	}

}
