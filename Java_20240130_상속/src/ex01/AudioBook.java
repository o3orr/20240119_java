package ex01;

public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	AudioBook() {}
	
	
	AudioBook(String title, String author, int publicationYear, double length, String narrator) {
		super(title, author, publicationYear);
		this.length = length;
		this.narrator = narrator;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Length: " + length + ", "+ "Narrator: " + narrator);
	}

}
