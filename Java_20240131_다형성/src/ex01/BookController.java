package ex01;

public class BookController {

	public static void main(String[] args) {
		
		method(new Novel("a", "a",123, "a"));
		method(new TextBook("a", "a",123, "a"));
		method(new Magazine("a", "a",123, "a"));
		

	}
	
	public static void method(Book book) {
		System.out.println(book.getDetails());
	}

}
