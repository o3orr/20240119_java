package ex01;

import java.util.Objects;

public class EqualsEx01 {

	public static void main(String[] args) {
		
		String str1 = new String("Korea");
		String str2 = new String("Korea");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Box b1 = new Box(10);
		Box b2 = new Box(10);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2)); //box 클래스에서 오버라이딩 되지 않아서

	}

}


class Box {
	int x;
	
	public Box(int x){
		this.x = x;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Box) {
			return x == ((Box)obj).x;
		}
		return false;
	 
}

}
