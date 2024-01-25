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
			case 1 : ac = new FreeSaving("이름");
			break;
			case 2 : ac = new ChallengeSaving("이름");
			break;
			case 3 : ac = new Deposit("이름");
			break;
		}
		
		

	}

}
