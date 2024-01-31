package ex01;

public class Book {
	private String title;
	private String author;
	private int publicationYear ;
	
	public Book() {}
	
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	public void displayInfo() {
		System.out.println("Title: " + title + ", "+ "Author: " + author + ", " + 
						"Year: " + publicationYear
				);
	}

}
