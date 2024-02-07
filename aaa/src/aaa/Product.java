package aaa;

public class Product<K, M> { //K와 M만 들어갈 수 있음
	
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	
	public M getModel() {
		return model;
	}
	
	public void setKind(K Kind) {
		this.kind = kind; //타입이 K
	}
	
	public void setModel(M model) {
		this.model = model;
	}

}
