package ex04;

class Box<T> {
	private T num;
	
	public void set(T num) {
		this.num = num;
	}
	
	public T get() {
		return num;
	}
}

public class BoxEx01 {

	public static void main(String[] args) {

		Box<Integer> ibox = new Box<Integer>();
		ibox.set(123);
		int num = ibox.get();
		System.out.println(num);
		
		System.out.println("--------------------------");
		
		Box<Double> dBox = new Box<>();
		dBox.set((double) 123);
		double dNum = dBox.get();
		System.out.println(dNum);
		

	}

}
