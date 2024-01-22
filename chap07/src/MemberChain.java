
public class MemberChain {
	String name;
	String country;
	int age;
	
	public MemberChain() {
		this("홍길순"); 
	}
	
	public MemberChain(String name) {
		this(name, 20);
	}
	
	public MemberChain(String name, int age) {
		this(name, age, "대한민국");
	}
	
	public MemberChain(String name, int age, String country) {
		this.name = name;
		this.age = age;		
		this.country = country;		
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
	}
	
	

}
