
public class CartItem {
	
	private String[] itemBook = new String[7];
	private String bookID; //북아이디
	private int quantity; //수량
	private int totalPrice;  //총 가격
	
	public CartItem() {
	 // 기본 생성자	
	}
	
	public CartItem(String[] book) { //일반 생성자
		this.itemBook = book; //배열 전체가 들어가나
		this.bookID = book[0];  //뭐지이거? 아 처음에 ISAN어쩌구 그거
		this.quantity = 1;
		updateTotalPrice();
	}
	
	public void updateTotalPrice() {// TODO Auto-generated method stub
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
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
		this.bookID = bookID;
		this.updateTotalPrice();
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	

}
