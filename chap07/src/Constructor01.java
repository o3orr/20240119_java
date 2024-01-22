
public class Constructor01 {

	public static void main(String[] args) {
		Student st = new Student(); // 기본 생성자호출
		st.insertRecord(20221004, "홍길순"); // Student클래스의 멤버변수들의 값을 바꾸는 메서드
		st.printInfo();
		
		Student st2 = new Student(20221203, "홍길동");
		st2.printInfo();
	}

}
