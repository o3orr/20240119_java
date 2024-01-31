package ex01;

public class Magazine extends Book{
	
	private String cycle;
	
	public Magazine() {}
	
	public Magazine(String title, String author, int publishYear, String cycle) {
		super(title, author,publishYear);
		this.cycle = cycle;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()
				+ " 발행 주기: " + getCycle();
	}
	
	
	public String getCycle() {
		return cycle;
	}

	public void setField(String cycle) {
		this.cycle = cycle;
	}


}