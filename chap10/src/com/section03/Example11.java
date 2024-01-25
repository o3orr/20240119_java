package com.section03;

import java.util.*;

public class Example11 {

	public static void main(String[] args) {
		String str = "Java, C, Python, JSP, PHP";
		StringTokenizer st = new StringTokenizer(str, ",");
		//str을 ,로 나눠서 st에 저장해줌
		
		while(st.hasMoreElements()) { //토큰이 남아있다면 없으면 하지않음
			System.out.println(st.nextElement());
			//토큰에 있는 값 출력
		}

	}

}
