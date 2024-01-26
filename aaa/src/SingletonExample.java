

public class SingletonExample {

	public static void main(String[] args) {

		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton(); 컴파일 에러

		
		//정적 메서드를 호출해서 싱글톤 객체 얻음
		//static이라 인스턴스 생성없이 사용할수있음
		//싱글톤 객체 자체에서 인스턴스 생성
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		
		//동일한 객체를 참조하는지 확인
		if(s1 == s2) { //주소 비교
			System.out.println("같은 싱글톤 객체입니다");
		} else {
			System.out.println("다른 싱글톤 객체입니다");
		}
	}
}
