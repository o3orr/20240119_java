package ex02;

public class switch01 {

	public static void main(String[] args) {
		char grade = 99;
		
		switch(grade / 10) {
		case 10:
		case 9:
			System.out.println("매우 우수");
			break;
		case 8:
			System.out.println("우수");
			break;
		case 7:
			System.out.println("좋음");
			break;
		case 6:
			System.out.println("좀 더 열심히");
			break;
		case 5:
			System.out.println("미흡");
			break;
		default:
			System.out.println("잘못된 등급");
		}

	}

}
