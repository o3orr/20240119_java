
public class GenericExample2 {
	
	//제한된 타입 파라미터를 갖는 제네릭 메서드
	//number의 자손만 들어올 수 있음
	public static <T extends Number> boolean compare(T t1, T t2) {
		// 아무 기본형 숫자타입을 매개변수로넣어서 double실수형태로 바꾸고 
		// 값이 같은지 아닌지 비교해서 boolean형태로 출력하는 함수 
		
		//t의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " +
						t2.getClass().getSimpleName()+ ")");
		
		//number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
		
	}

	public static void main(String[] args) {
		//제네릭 메서드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		

	}

}
