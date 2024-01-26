
public class IndexOf {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바"); //숫자반환
		if (location != -1) { 
			//반환된 위치가 -1이 아니면, 즉 "자바"가 문자열에 존재하면
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}
