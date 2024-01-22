
public class Example07 {

	public static void main(String[] args) {
		Chain c = new Chain();
		
		// 기본 생성자 호출시 일반 생성자 Chain(int)호출
		// 일반 생성자 호출시 일반 생성자 Chain(int, int) 호출 
		// 일반 생성자 Chain(int, int)먼저 실행되고 
		// 다시 자신을 호출한 일반 생성자 Chain(int)으로 돌아감
		// 일반 생성자 Chain(int) 실행되고
		// 자신을 호출한 기본생성자로 돌아감
		
		// 기본 생성자 하나만 써도 많이 초기화할 수 있게

	}

}
