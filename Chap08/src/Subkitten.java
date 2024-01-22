
public class Subkitten extends SuperCat {
	
	String age = "2살";
	
	void printInfo() { //오버라이딩 
		System.out.println("아기 고양이입니다");
	}
	
	void printDetail() {
		super.printInfo(); //조상설명
		System.out.println("품종은 " + super.breed + "나이는 " + super.age);
		
		printInfo(); //자손 설명
		System.out.println("품종은 " + this.breed + "나이는 " + this.age);
	}

}
