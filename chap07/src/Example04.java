
public class Example04 {

	public static void main(String[] args) {
		Cat cat1 = new Cat("페르시안"); // 기본 생성자 호출
		// cat1 인스턴스의 멤버변수 breed의 값을 "페르시안"으로 바꿈
		
		Cat cat2 = new Cat("샴"); // 기본 생성자 호출
		// cat2 인스턴스의 멤버변수 breed의 값을 "샴"으로 바꿈
		
		Cat cat3 = new Cat("러시안블루"); // 기본 생성자 호출
		// cat3 인스턴스의 멤버변수 breed의 값을 바꿈
		
		Cat cat4 = new Cat("러시안블루" , "회색");
		
		
		System.out.println(cat1.breed);
		System.out.println(cat2.breed);
		System.out.println(cat3.breed);
		System.out.println(cat4.breed);
		System.out.println(cat4.color);

	}

}
