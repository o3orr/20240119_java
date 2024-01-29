package aaa;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc; //인터페이스 변수 선언
		
		rc = new Television();
		
		rc.turnOn(); //tv를 켭니다 
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
 
	}

}
