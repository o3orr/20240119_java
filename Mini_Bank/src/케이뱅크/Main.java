package 케이뱅크;

import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		AccountProduct ac = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("상품선택 [1]자유적금 [2]챌린지박스 [3]예금 : ");
		int sel = sc.nextInt();
		switch(sel) {
			case 1 : ac = new FreeSaving("이름"); //자유적금
			break;
			case 2 : ac = new ChallengeSaving("이름"); //챌린지박스
			break;
			case 3 : ac = new Deposit("이름");//예금 - 오버라이딩많음
			break;
			default :
			System.out.println("상품을 잘못 선택하셨습니다");
		}
		System.out.print("납입 금액 : ");
		int money = sc.nextInt();
		System.out.print("가입 기간 : ");
		int period = sc.nextInt();
		
		if(sel == 1 || sel == 2) 
			ac.realRate(period); //자유적금과 챌린지박스는 적금이라서 실제이율 구해야함
			//deposit는 예금이라서 그런 거 없음
		
		ac.basicInterest(money, period); //세전 이자금액 구하기
		//고른 케이스에 맞게 메서드를 호출함 
		
		ac.realInterest(money, period); //세후 이자금액 구하기
		DecimalFormat formatter = new DecimalFormat("#,##0");
		
		//세전 만기금액구하는 메서드 호출해서 포맷에맞게 출력
		String maturityAmount = formatter.format(ac.maturityAmount());
				
		//세후 만기금액구하는 메서드 호출해서 포맷에맞게 출력
		String realMaturityAmount = formatter.format(ac.realMaturityAmount());
		
		
		System.out.println("====== " + ac.getName() + " 님의 상품 가입 정보 ======");
		System.out.printf("금리 : %.2f%s\n", (ac.rate * 100), "%");
		System.out.printf("가입기간 : %d개월\n", ac.period);
		System.out.println("만기금액(세전) : " + maturityAmount + "원");
		System.out.println("만기금액(세후) : " + realMaturityAmount + "원");
		
		

	}

}
