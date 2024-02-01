package ex01;

public class BookController {

	public static void main(String[] args) {
		
		/*
		 * method(new Novel("a", "a",123, "a")); method(new TextBook("a", "a",123,
		 * "a")); method(new Magazine("a", "a",123, "a"));
		 */
		
		ChildSpeaker s = new ChildSpeaker(5);
		s.powerOn();
		s.SoundUp();
		s.SoundDown();
		s.powerOff();
		

	}
	
	public static void method(Book book) {
		System.out.println(book.getDetails());
	}

}
