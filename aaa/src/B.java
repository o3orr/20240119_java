
public class B {

	public static void main(String[] args) {


		int[] scores = {83, 90, 87};
		
		
		int sum = 0;
		for (int i = 0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		printItem(new int[] {3, 4, 5});

	}
	
	//printItem() 메소드 선언
	public static void printItem(int[] scores) {
		//매개변수가 참조하는 배열의 항목을 출력
		for(int i = 0; i<3; i++) {
			System.out.println(scores[i]);
		}
	}

}
