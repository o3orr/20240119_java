package ex01;

public class EBook extends Book{
	
	private double fileSize;
	private String format;
	
	
	EBook() {}

	EBook(String title, String author, int publicationYear, double fileSize, String format) {
		super(title, author, publicationYear);
		this.fileSize = fileSize;
		this.format = format;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("FileSize: " + fileSize + ", "+ "Format: " + format);
	}

}
