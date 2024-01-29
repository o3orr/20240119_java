package ex01;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	Book() {
		this("이름없음");
	}
	
	Book(String t) {
		this(t, "작가없음");
	}
	
	Book(String t, String a){
		this(t, a, 0);
	}
	
	Book(String t, String a ,int i) {
		this(t, a, i, "출판사 없음");
	}
	
	Book(String t, String a ,int i, String p){
		title = t;
		author = a;
		price = i;
		publisher = p;
	}
	
	void displayBookInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
		System.out.println(price);
	}
	
	
	public static void main(String[] args) {
		Book b = new Book();
		
		b.displayBookInfo();
	}
}
