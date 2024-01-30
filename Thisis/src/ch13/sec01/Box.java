package ch13.sec01;

public class Box<T> {
	public T content;
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		//Object의 equals()메소드로 content필드값 비교
		return result;
	}
}
