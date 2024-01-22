
public class Student {
	int id;
	String name;
	
	Student() { //기본 생성자
		System.out.println("기본 생성자 Student() 호출");
		
	}
	
	Student(int id, String name) {
		System.out.println("일반생성자 Student(int, String) 호출");
		this.id = id;
		this.name = name;
	}
	
	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void printInfo() {
		System.out.println(id);
		System.out.println(name);
	}

}
