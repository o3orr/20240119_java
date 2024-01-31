package Chap04;
import java.util.*;
public class IntQueueTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		IntQueue s = new IntQueue(64); //최대 64개를 넣을 수 있는 큐
		
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity()); //개수, 총용량
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료: ");
			
			int menu = in.nextInt();
			if (menu == 0) break;
			
			int x;
			switch(menu) {
			case 1: // 인큐
				System.out.print("데이터: ");
				x = in.nextInt(); //무슨 숫자를 넣을지 입력
				try { //큐에 데이터를 넣을때 발생될 예외처리
					s.enque(x); //입력된 데이터 큐에 넣기
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다");
				}
				break;
				
			case 2:
				try { //큐에서 데이터를 꺼낼때 발생될 예외처리
					x = s.deque(); // 큐의 맨앞 값을 꺼내서 x에 대입
					System.out.println("디큐한 데이터는 " + x + "입니다");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다");
				}
				break;
			
			case 3:
				try {
					x = s.peek(); //프런트에 있는 데이터 꺼내서 x에 넣기
					System.out.println("피크한 데이터는 " + x + "입니다");
				} catch (IntQueue.EmptyIntQueueException e) { //큐에서 피크할때 큐가비어있는 예외 처리
					System.out.println("큐가 비어 있습니다");
				}
				break;
				
			case 4: 
				s.dump();
				break;
			/*
			 * case 5: x = in.nextInt(); System.out.println(s.search(x));
			 */
			}
		}

	}

}
