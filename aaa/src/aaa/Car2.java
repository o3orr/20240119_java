package aaa;

public class Car2 {
	// 필드 선언
	private int speed;
	private boolean stop;
	
	//speed 필드의 Getter/Settet 선언
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			//매개변수 값이 음수일경우 speed필드를 0으로 저장하고
			//메소드 실행 종료
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	 
	//stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}

}
