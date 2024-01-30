package ch13.sec01;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				//Toolkit 객체얻기
				for (int i = 0; i<5; i++) {
					toolkit.beep();// 비프음 발생
					try { 
						Thread.sleep(500); //0.5초간 일시정지
					} catch(Exception e) {} //sleep예외처리
				}
				
			} //작업 스레드 생성
			
		});
		
		thread.start(); //작업 스레드 실행
		
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
		} try {
			Thread.sleep(500);
		} catch(Exception e) {}
	}

}
