
public class Calculator {
	
	public static void main(String[] args) {
		powerOn();
		powerOff();
		
		int num = plus(5,2);
		System.out.println(num);
		
		double avg = divide(5, 2);
		System.out.println(avg);
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	static void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	static double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}

}
