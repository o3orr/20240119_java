
public class Example02 {

	public static void main(String[] args) {


		try {
			Integer in = new Integer("abc");
			in.intValue(); //객체에서 정수값을 얻음
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 ArithmeticException " + e);
		}
		catch(NumberFormatException e) {
			
		}

	}

}
