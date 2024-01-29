package ex01;

public class Student {
	private String name;
	private int studnetId;
	private String major;
	
	public void setName(String n) {
		name = n;
	}
	
	public void setId(int n) {
		studnetId = n;
	}
	
	public void setMajor(String n) {
		major = n;
	}
	
	Student() {}
	
	Student(String n, int i, String m) {
		name = n;
		studnetId = i;
		major = m;
	}
	
	void displayInformation() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studnetId);
		System.out.println("전공 : " + major);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("최영서");
		s.setId(202151064);
		s.setMajor("컴정");
		
		s.displayInformation();
	}
 
}


