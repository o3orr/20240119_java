package ex01;

import java.util.regex.*;

public class RegularEx4 {

	public static void main(String[] args) {
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken"; 
		
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern); //broken을 패턴으로 사용
		Matcher m = p.matcher(source);
		System.out.println(source); //문장 그대로 출력
		
		int i = 0;
		
		while(m.find()) {
			System.out.println(++i + "번째 매칭:" + m.start()+ "~"
					+ m.end());
			
			m.appendReplacement(sb, "drunken");
		}
		m.appendTail(sb);

	}

}
