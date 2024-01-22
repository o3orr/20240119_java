
public class Inheritance01 {
	Calculation c = new Calculation();
	
	Inheritance01() {
		System.out.println("기본생성자");
	}
	//Calculation을 상속받아서 
	// 멤버변수가 z, addition, subtraction, multiplication 4개
	public void multiplicaion(int x, int y) {
		c.z = x * y;
		System.out.println("두 수의 곱셈 : " + c.z);
	}

	public static void main(String[] args) {
		int a = 20, b = 10;
		Inheritance01 i = new Inheritance01();
		Calculation c = new Calculation();
		c.addition(a, b);
		c.subtraction(20, 10); // 위에거랑 똑같은거
		i.multiplicaion(a, b);
		

	}

}
