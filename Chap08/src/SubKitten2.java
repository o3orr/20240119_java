
public class SubKitten2 extends SuperCat2{
	String name;
	String age = "2살";
	
	public SubKitten2(String n1, String n2) {
		//매개 변수를 2개 받아서 부모고양이와 자식고양이 이름 둘다 초기화
		super(n1); //부모고양이 이름출력
		this.name = n2; 
		//이건 부모의 멤버변수 name이 아니라 자손의 멤버변수 name
		System.out.println("아기 고양이입니다" + " 이름은" + name); //자식고양이 
		
	}

}
