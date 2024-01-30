
public class CartItem {
	
	private String[] itemBook = new String[7];
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	public CartItem() {
	 // 기본 생성자	
	}
	
	public CartItem(String[] book) { //일반 생성자
		this.itemBook = book; //배열 전체가 들어가나
		this.bookID = book[0];  //뭐지이거? 아 처음에 ISAN어쩌구 그거
		this.quantity = 1;
		updateTotalPrice();
	}
	
	private void updateTotalPrice() {
		// TODO Auto-generated method stub
		
	}

	public String[] getItemBook() {
		return itemBook; //배열 전체 반환
	}
	
	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}
	
	public String getBookID() {
		return bookID;
	}
	
	public void setBookID(String bookID) {
		
	}
	
	

}
