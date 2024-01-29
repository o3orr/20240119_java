package aaa;

public class Television implements RemoteControl {
	
	private int Volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) { 
		if(volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		} else {
			this.Volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.Volume);
		
	}

}
