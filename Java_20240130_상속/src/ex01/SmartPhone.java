package ex01;

public class SmartPhone extends Phone{
	
	private boolean wifi;
	
	public SmartPhone() {
		System.out.println("SmartPhone()");
	}
	
	public SmartPhone(boolean wifi) {
		super("m1", "흰색");
		System.out.println("SmartPhone(boolean)");
		this.wifi = wifi;
	}
	
	@Override
	public void sendVoice(String message) {
		System.out.println("음성메세지 : " + message);
	}
	
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SmartPhone [wifi=" + wifi + "]";
	}

	public void internet() {
		System.out.println("인터넷 연결");
	}

}
