package ch13.sec01;

public class Course {
	
	//모든 사람이 등록가능 ?와일드 카드로 어떤 객체든 등록가능하게 함 
	//타입 
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이 Course1을 등록함");
	}
	
	//학생이면 등록가능 와일드 카드로 학생의 하위만 등록가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이 Course2를 등록함");
	}
	
	
	//직장인 및 일반인만 등록가능 와일드 카드로 worker의 상위만 등록가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이 Course3를 등록함");
	}

}
