package ex01;

public class TextBook extends Book{
	
	private String field;
	
	public TextBook() {}
	
	public TextBook(String title, String author, int publishYear, String field) {
		super(title, author,publishYear);
		this.field = field;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()
				+ " 장르: " + getField();
	}
	
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}


}
