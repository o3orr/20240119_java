
public class Chain {
	
	Chain() {
		this(10);
		System.out.println("기본 생성자 Chain() 호출");
	}
	
	Chain(int x) {
		this(5, 6);
		System.out.println("일반 생성자 Chain(int) 호출");
		System.out.println("x의 값 : " + x);// 생성자에서 다른 생성자 호출 꼭 맨 첫줄에서만 가능
	}
	
	Chain(int x, int y) {
		System.out.println("일반 생성자 chain(int, int) 호출");
		System.out.printf("x와 y의 값 : %d %d", x, y);
		System.out.println();
	}

}
