package ch11;

public class LamdaExample {

	public static void main(String[] args) {
		action((x,y) -> {
			int result = x+y;
			System.out.println("result: " + result);
		});
		
		action((x,y) -> {
			int result = x-y;
			System.out.println("result: " + result);
		});
		
		
		Person person = new Person();
		//person안에 함수형 인터페이스를 매개변수로하는 action메서드가 작성되어있음
		
		//매개변수가 두개일 경우
		person.action((name, job) -> {
			System.out.println();
			System.out.println("프로그래밍을 합니다");
		});
		
		//person.action(()-> System.out.println("퇴근합니다"));

	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculate(x,y);
	}

}
