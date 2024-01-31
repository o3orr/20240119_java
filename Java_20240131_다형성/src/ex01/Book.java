package ex01;

public class Book {
	private String title;
	private String author;
	private int publishYear;
	
	Book() {}
	
	public Book(String title, String author, int publishYear) {
		this.setTitle(title);
		this.author = author;
		this.setPublishYear(publishYear);
	}
	
	public String getDetails() {
		return "제목: " + getTitle() + " 저자: " + getAuthor() + " 출판 연도: " + getPublishYear();
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
