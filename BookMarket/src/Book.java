
public class Book extends Item{
	private String author;
	private String description;
	private String categry;
	private String releaseDate;

	public Book(String bookId, String name, int unitPrice) {
		super(bookId, name, unitPrice);
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String bookId, String name, int unitPrice, String author, String description,
			String categry, String releaseDate) {
		super(bookId, name, unitPrice);
		this.author = author;
		this.description = description;
		this.categry = categry;
		this.releaseDate = releaseDate;
	}


	@Override
	String getBookId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getUnitPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String setBookId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String setName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String setUnitPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
