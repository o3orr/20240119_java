
class Calculate { //오버로딩
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
}


public class Example07 {

	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.add(1, 2);
		c.add(3.4, 5.6);

	}

}
