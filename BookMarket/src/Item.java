
public abstract class Item {
	String bookId;
	String name;
	int unitPrice;
	
	public Item(String bookId, String name, int unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	
	abstract String getBookId();
	abstract String getName();
	abstract String getUnitPrice();
	abstract String setBookId();
	abstract String setName();
	abstract String setUnitPrice();

}
