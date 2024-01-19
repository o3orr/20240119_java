package ex03;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int exam = 5000;
		
		int hour = exam / 3600;
		
		exam %= 3600;
		int minute = exam / 60;
		
		exam %= 60;
		int second = exam;
		
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
		
		
		int a = 5;
		int b = 0;
		int c = 0;
		
		b = a++;
		// b = a; 먼저대입
		// a++;
		
		c = ++a;
		// ++a;
		// c = a; 나중에대입
		
		int x = 1;
		int y = 2;
		int z = ++x + -y;
		
		System.out.println("");
		System.out.println(z);
		
		
		
	}

}
