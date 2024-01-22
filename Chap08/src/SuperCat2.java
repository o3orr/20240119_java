
public class SuperCat2 {
	String name;
	String age = "15살";
	
	SuperCat2(String n) { //매개변수가 문자열 하나인 생성자
		name = n; //SuperCat클래스의 멤버변수인 name을 매개변수 n으로 변경
		System.out.println(name);
		//객체 만들때 생성자로 이름넣어서 출력 
	}

}
