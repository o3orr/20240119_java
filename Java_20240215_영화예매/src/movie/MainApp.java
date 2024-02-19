package movie;

public class MainApp { //프로그램 시작 메인메뉴 

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다");
		
		Menu menu = MainMenu.getInstance();
		//타입이 menu라서 print와 next만 쓸수있음
		
		while(menu != null) {
			menu.print();
			menu = menu.next();
		}
		
		System.out.println("프로그램을 종료합니다");
	}

}
