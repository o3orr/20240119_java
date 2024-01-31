package ex01;

public class Novel extends Book{
	
	private String genre;
	
	public Novel() {}
	
	public Novel(String title, String author, int publishYear, String genre) {
		super(title, author,publishYear);
		this.genre = genre;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()
				+ " 장르: " + getGenre();
	}
	
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


}
