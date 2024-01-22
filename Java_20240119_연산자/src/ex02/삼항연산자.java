package ex02;

public class 삼항연산자 {
	
	public String a() {
		return "합격";
	}
	
	public String b() {
		return "불합격";
	}

	public static void main(String[] args) {
		
		삼항연산자 c = new 삼항연산자();
		
		int jumsu = 90;
		
		if(jumsu >= 60) {
			System.out.println("합격");
		} else
			System.out.println("불합격");
	

		//삼항 연산자
		
		String msg = (jumsu >= 60) ? c.a() : c.b();
		
		System.out.println(msg);
	}

}
